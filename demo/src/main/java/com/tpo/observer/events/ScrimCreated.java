package com.tpo.observer.events;

import com.tpo.observer.IDomainEvent;

public class ScrimCreated implements IDomainEvent {
    public final int scrimId;
    public ScrimCreated(int scrimId) { this.scrimId = scrimId; }
}

