package com.tpo.observer;

public interface ISubscriber {
    void onEvent(IDomainEvent e);
}

