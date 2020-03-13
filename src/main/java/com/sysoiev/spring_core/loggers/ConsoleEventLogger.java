package com.sysoiev.spring_core.loggers;

import com.sysoiev.spring_core.beans.Event;

public class ConsoleEventLogger implements EventLogger {
    @Override
    public void logEvent(Event event) {
        System.out.println(event.toString());
    }
}
