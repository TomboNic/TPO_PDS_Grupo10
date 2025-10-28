package com.tpo.app.facade;

import com.tpo.domain.builder.ScrimBuilder;
import com.tpo.domain.model.Rol;
import com.tpo.domain.model.Scrim;
import com.tpo.domain.model.Usuario;
import com.tpo.observer.DomainEventBus;
import com.tpo.observer.events.ScrimCreated;
import com.tpo.observer.events.ScrimStateChanged;

import java.util.HashMap;
import java.util.Map;

public class ScrimFacade {
    private final DomainEventBus bus;
    private final Map<Integer, Scrim> repo = new HashMap<>();

    public ScrimFacade(DomainEventBus bus) { this.bus = bus; }

    public int crearScrim() {
        Scrim s = new ScrimBuilder().build(bus);
        repo.put(s.getIdScrim(), s);
        bus.publish(new ScrimCreated(s.getIdScrim()));
        return s.getIdScrim();
    }

    public void postular(int id, Usuario u, Rol r) { repo.get(id).postular(u, r); bus.publish(new ScrimStateChanged(id, repo.get(id).getContext().getState().nombre())); }
    public void confirmar(int id, Usuario u) { repo.get(id).confirmar(u); bus.publish(new ScrimStateChanged(id, repo.get(id).getContext().getState().nombre())); }
    public void iniciar(int id) { repo.get(id).iniciar(); bus.publish(new ScrimStateChanged(id, repo.get(id).getContext().getState().nombre())); }
    public void finalizar(int id, com.tpo.domain.model.Resultado res) { repo.get(id).finalizar(res); bus.publish(new ScrimStateChanged(id, repo.get(id).getContext().getState().nombre())); }
    public void cancelar(int id) { repo.get(id).cancelar(); bus.publish(new ScrimStateChanged(id, repo.get(id).getContext().getState().nombre())); }
    public void armarLobby(int id) { /* depende de reglas */ }
}
