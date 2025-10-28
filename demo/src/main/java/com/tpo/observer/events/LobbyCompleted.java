package com.tpo.observer.events;

import com.tpo.observer.IDomainEvent;

public class LobbyCompleted implements IDomainEvent {
    public final int scrimId;
    public LobbyCompleted(int scrimId) { this.scrimId = scrimId; }
}

