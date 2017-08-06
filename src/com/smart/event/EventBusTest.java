package com.smart.event;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

/**
 * event-bus
 * Created by jinhua on 17-8-6.
 */
public class EventBusTest {
    private EventBus eventBus;

    @org.junit.Before
    public void init() {
        eventBus = new EventBus();
    }

    private void register() {
        eventBus.register(this);
    }

    private void post() {
        eventBus.post("hello");
    }

    @Subscribe
    public void listener(String str) {
        System.out.println("receive: " + str);
    }

    @org.junit.Test
    public void test() throws InterruptedException {
        register();
        post();
    }
}
