package com.hxr.deepspringlearn.model.impl;

import com.hxr.deepspringlearn.anno.Camera;
import com.hxr.deepspringlearn.anno.GamePlayer;
import com.hxr.deepspringlearn.config.optional.CameraConfig;
import com.hxr.deepspringlearn.config.optional.GamePlayerConfig;
import com.hxr.deepspringlearn.model.Phone;
import com.hxr.deepspringlearn.model.PhoneFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gamingPhoneFactory")
@GamePlayer("gamingPhone")
@Camera("gamingPhone")
public class GamingPhoneFactory implements PhoneFactory {

    private static Logger logger = LoggerFactory.getLogger(GamingPhoneFactory.class);

    @Autowired
    GamePlayerConfig gamePlayerConfig;

    @Autowired
    CameraConfig cameraConfig;

    public GamingPhoneFactory() {
        logger.info("GamingPhoneFactory construct");
    }

    public Phone createPhone() {
        logger.info("start to create gaming phone " +
                        "\n Gaming: cost:{} graphic:{} " +
                        "\n Gamera: front-pixel:{} back-pixel:{} webcam:{}",
                gamePlayerConfig.getCost(), gamePlayerConfig.getGraphic(),
                cameraConfig.getFrontpixel(), cameraConfig.getBackpixel(), cameraConfig.getWebcam());

        Phone phone = new GamingPhone();
        return phone;
    }
}
