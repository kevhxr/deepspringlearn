package com.hxr.deepspringlearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BackService {

    @Autowired
    FrontService frontService;

    public BackService() {
        System.out.println("backService construction complete");
    }

    public void doTest() {
        System.out.println("back service startup successfully!");
    }

    @PostConstruct
    /**
     * 生命周期初始化的回调方法
     */
    public void afterConstruct() {
        frontService.doTest();
    }
}
