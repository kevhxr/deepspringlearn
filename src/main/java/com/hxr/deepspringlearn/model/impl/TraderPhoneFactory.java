package com.hxr.deepspringlearn.model.impl;

import com.hxr.deepspringlearn.anno.Camera;
import com.hxr.deepspringlearn.anno.Trading;
import com.hxr.deepspringlearn.config.optional.CameraConfig;
import com.hxr.deepspringlearn.config.optional.TradingConfig;
import com.hxr.deepspringlearn.model.Phone;
import com.hxr.deepspringlearn.model.PhoneFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("traderPhoneFactory")
@Trading("traderPhone")
@Camera("traderPhone")
public class TraderPhoneFactory implements PhoneFactory {

    private static Logger logger = LoggerFactory.getLogger(TraderPhoneFactory.class);

    @Autowired
    TradingConfig tradingConfig;

    @Autowired
    CameraConfig cameraConfig;

    public TraderPhoneFactory() {
        logger.info("TraderPhoneFactory construct");
    }

    public Phone createPhone() {
        logger.info("start to create trader phone " +
                        "\n Trading: bank:{}" +
                        "\n Gamera: front-pixel:{} back-pixel:{} webcam:{}",
                tradingConfig.getBank(),
                cameraConfig.getFrontpixel(), cameraConfig.getBackpixel(), cameraConfig.getWebcam());

        Phone phone = new TraderPhone();
        return phone;
    }
}
