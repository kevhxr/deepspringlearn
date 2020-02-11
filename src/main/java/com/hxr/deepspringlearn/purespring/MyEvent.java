package com.hxr.deepspringlearn.purespring;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */

    private String message;
    public MyEvent(Object source, String message) {
        super(source);
        this.message = message;
    }


    @Override
    public Object getSource() {
        return message;
    }
}
