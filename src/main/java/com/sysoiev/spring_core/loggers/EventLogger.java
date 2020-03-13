package com.sysoiev.spring_core.loggers;

import com.sysoiev.spring_core.beans.Event;

public interface EventLogger {
    void logEvent(Event event);
}
