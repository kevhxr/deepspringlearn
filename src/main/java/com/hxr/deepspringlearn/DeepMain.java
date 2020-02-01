package com.hxr.deepspringlearn;

import com.hxr.deepspringlearn.service.BackService;
import com.hxr.deepspringlearn.service.FrontService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class DeepMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DeepMain.class, args);
        BackService backService = (BackService) ctx.getBean("backService");
        //FrontService frontService = ctx.getBean(FrontService.class);
        //backService.doTest();

    }
}
