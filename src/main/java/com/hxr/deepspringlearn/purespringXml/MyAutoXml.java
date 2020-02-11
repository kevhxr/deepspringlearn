package com.hxr.deepspringlearn.purespringXml;

import com.hxr.deepspringlearn.purespring.MyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import javax.annotation.PostConstruct;

public class MyAutoXml {

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @PostConstruct
    public void doTest(){
        applicationEventPublisher.publishEvent(new MyEvent(this,"MyAutoXml event"));
    }
}
