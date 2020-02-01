package com.hxr.deepspringlearn.model.impl;

import com.hxr.deepspringlearn.model.Phone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TraderPhone implements Phone {
    private static Logger logger = LoggerFactory.getLogger(TraderPhone.class);

    @Override
    public void releasePhone(){
        logger.info("New trader phone has been released");
    }
}
