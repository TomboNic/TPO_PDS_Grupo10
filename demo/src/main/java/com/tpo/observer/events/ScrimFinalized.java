package com.tpo.observer.events;

import com.tpo.observer.IDomainEvent;

public class ScrimFinalized implements IDomainEvent {
    public final int scrimId;
    public ScrimFinalized(int scrimId) { this.scrimId = scrimId; }
}

