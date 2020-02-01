package com.hxr.deepspringlearn.service;

import com.hxr.deepspringlearn.model.Phone;
import com.hxr.deepspringlearn.model.PhoneFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Service
public class PhoneFactoryService {


    @Resource(name = "gamingPhoneFactory")
    PhoneFactory gamingPhoneFactory;

    @Resource(name = "traderPhoneFactory")
    PhoneFactory traderPhoneFactory;

    private static Logger logger = LoggerFactory.getLogger(PhoneFactoryService.class);

    public PhoneFactoryService() {
    }
    @PostConstruct
    /**
     * 生命周期初始化的回调方法
     */
    public void afterConstruct(){
        Phone playerPro = gamingPhoneFactory.createPhone();
        Phone traderPro = traderPhoneFactory.createPhone();
        playerPro.releasePhone();
        traderPro.releasePhone();
    }

}
