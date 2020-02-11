package com.hxr.deepspringlearn.purespring;

import com.hxr.deepspringlearn.purespringXml.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MyService {

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    @Qualifier("myDao1")
    private MyDao myDao;
    @Autowired
    @Qualifier("myDao2")
    private MyDao myDao2;

    @Autowired
    KafkaConsumer kafkaConsumer;

    @PostConstruct
    public void doPost() {
        System.out.println(applicationEventPublisher);
        applicationEventPublisher.publishEvent(new MyEvent(this, "startup   @!!!!"));
        kafkaConsumer.doTest();
        myDao.dotest();
        myDao2.dotest();
    }

}
