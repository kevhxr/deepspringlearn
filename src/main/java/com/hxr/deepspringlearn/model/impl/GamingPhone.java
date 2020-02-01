package com.hxr.deepspringlearn.model.impl;

import com.hxr.deepspringlearn.model.Phone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GamingPhone implements Phone {
    private static Logger logger = LoggerFactory.getLogger(GamingPhone.class);

    @Override
    public void releasePhone(){
        logger.info("New gaming phone has been released");
    }
}
