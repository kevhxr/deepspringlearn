package com.hxr.deepspringlearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class FrontService {

    @Autowired
    BackService backService;

    public FrontService() {
        System.out.println("frontService construction complete");
    }

    public void doTest() {
        System.out.println("front service startup successfully!");
    }

    @PostConstruct
    /**
     * 生命周期初始化的回调方法
     */
    public void afterConstruct() {
        backService.doTest();
    }
}
