package com.escrims;

import com.tpo.app.facade.ScrimFacade;
import com.tpo.app.subscribers.NotificationSubscriber;
import com.tpo.domain.builder.ScrimBuilder;
import com.tpo.domain.calendario.Calendario;
import com.tpo.domain.command.*;
import com.tpo.domain.enums.Formato;
import com.tpo.domain.enums.TipoRol;
import com.tpo.domain.moderacion.*;
import com.tpo.domain.model.*;
import com.tpo.domain.strategy.matchmaking.*;
import com.tpo.infra.factory.NotificadorFactoryDev;
import com.tpo.infra.factory.NotificadorFactoryProd;
import com.tpo.observer.DomainEventBus;
import com.tpo.observer.events.ScrimStateChanged;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class DemoMain {
    private static void header(String title) { System.out.println("\n=== " + title + " ==="); }

    public static void main(String[] args) {
        DomainEventBus bus = new DomainEventBus();
        NotificadorFactoryDev devFactory = new NotificadorFactoryDev();
        NotificadorFactoryProd prodFactory = new NotificadorFactoryProd();

        // Subs al bus: logging + notificaciones
        bus.subscribe(e -> {
            if (e instanceof com.tpo.observer.events.ScrimStateChanged s) {
                System.out.println("Evento: ScrimStateChanged -> estado=" + s.newState);
            } else {
                System.out.println("Evento: " + e.getClass().getSimpleName());
            }
        });
        bus.subscribe(new NotificationSubscriber(devFactory));

        // 1) Crear Scrim via Facade + Builder (interno)
        header("Creación de Scrim");
        ScrimFacade facade = new ScrimFacade(bus);
        int scrimId = facade.crearScrim();
        System.out.println("Scrim creado con id=" + scrimId);

        // 2) Postulaciones y Confirmaciones
        header("Postulaciones y Confirmaciones");
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();
        Rol rolDuelista = new Rol("Duelista", TipoRol.User);
        Rol rolSoporte = new Rol("Soporte", TipoRol.User);
        facade.postular(scrimId, u1, rolDuelista);
        facade.postular(scrimId, u2, rolSoporte);
        facade.confirmar(scrimId, u1);
        facade.confirmar(scrimId, u2);
        System.out.println("Postulados + confirmados: u1,u2");

        // 3) Iniciar y Finalizar
        header("Inicio y Finalización");
        facade.iniciar(scrimId);
        facade.finalizar(scrimId, new Resultado());

        // 4) Cancelación de otro Scrim
        header("Cancelación de Scrim");
        int scrimId2 = facade.crearScrim();
        facade.cancelar(scrimId2);

        // 5) Command: AsignarRol, Swap, Reemplazar
        header("Gestión de equipos (Command)");
        Scrim scrimLibre = new ScrimBuilder()
                .juego(new Juego("Valorant"))
                .formato(Formato.V5)
                .region(new Region("LATAM"))
                .rango(100, 300)
                .latenciaMax(80)
                .fecha(Instant.now())
                .duracion(Duration.ofMinutes(45))
                .cuposPorLado(5)
                .build(bus);

        GestorEquipos gestor = new GestorEquipos();
        gestor.ejecutar(new AsignarRolCommand(u1, rolDuelista, scrimLibre));
        gestor.ejecutar(new SwapJugadoresCommand(u1, u2, scrimLibre));
        gestor.ejecutar(new ReemplazarJugadorCommand(u1, u2, scrimLibre));
        gestor.undo(); // deshacer último
        System.out.println("Historial comandos: " + gestor.historialComandos.size());

        // 6) Strategy: Matchmaking rápido
        header("Matchmaking (Strategy)");
        Busqueda busqueda = new Busqueda();
        List<Usuario> disponibles = new ArrayList<>();
        disponibles.add(u1); disponibles.add(u2);
        GestorEmparejamiento gestorEmp = new GestorEmparejamiento();
        gestorEmp.modificarEstrategia(new EstrategiaPorRango(100));
        gestorEmp.emparejar(busqueda, disponibles);
        gestorEmp.modificarEstrategia(new EstrategiaPorLatencia());
        gestorEmp.emparejar(busqueda, disponibles);

        // 7) Moderación (CoR)
        header("Moderación (Chain of Responsibility)");
        IManejadorReporte auto = new AutoModerador();
        IManejadorReporte bot = new BotModerador();
        IManejadorReporte mod = new ModeradorHumano();
        IManejadorReporte admin = new AdministradorFinal();
        auto.setSiguiente(bot); bot.setSiguiente(mod); mod.setSiguiente(admin);
        ReporteConducta reporte = new ReporteConducta();
        auto.manejar(reporte);
        System.out.println("Reporte procesado por cadena de moderación");

        // 8) Calendario
        header("Calendario (Adapter)");
        Calendario calendario = new Calendario();
        calendario.crearEvento(scrimLibre);
        calendario.actualizarEvento(scrimLibre);
        calendario.eliminarEvento(scrimLibre);
        System.out.println("Operaciones de calendario ejecutadas");

        // 9) Notificaciones con distintas factories
        header("Notificaciones (Factories)");
        var notifDev = devFactory.crearNotificador();
        notifDev.enviar(new com.tpo.domain.notification.model.Notificacion("Recordatorio DEV", u1));
        var notifProd = prodFactory.crearNotificador();
        notifProd.enviar(new com.tpo.domain.notification.model.Notificacion("Recordatorio PROD", u2));

        // 10) Publicar un estado manual al bus
        header("Evento manual");
        bus.publish(new ScrimStateChanged(scrimId, "Confirmado"));

        System.out.println("\nDemo completa");
    }
}
