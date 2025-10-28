package com.tpo.observer.events;

import com.tpo.observer.IDomainEvent;

public class ScrimStateChanged implements IDomainEvent {
    public final int scrimId;
    public final String newState;
    public ScrimStateChanged(int scrimId, String newState) { this.scrimId = scrimId; this.newState = newState; }
}

