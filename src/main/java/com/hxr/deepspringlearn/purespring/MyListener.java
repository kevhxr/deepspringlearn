package com.hxr.deepspringlearn.purespring;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class MyListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println(event.getSource().toString());
    }
}
