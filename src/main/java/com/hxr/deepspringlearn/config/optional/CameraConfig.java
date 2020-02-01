package com.hxr.deepspringlearn.config.optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@ConfigurationProperties(prefix = "phone.camera")
public class CameraConfig {

    private static Logger logger = LoggerFactory.getLogger(CameraConfig.class);

    private int frontpixel;
    private int backpixel;
    private String webcam;

    public int getFrontpixel() {
        return frontpixel;
    }

    public void setFrontpixel(int frontpixel) {
        this.frontpixel = frontpixel;
    }

    public int getBackpixel() {
        return backpixel;
    }

    public void setBackpixel(int backpixel) {
        this.backpixel = backpixel;
    }

    public String getWebcam() {
        return webcam;
    }

    public void setWebcam(String webcam) {
        this.webcam = webcam;
    }

    @Bean("cameraConfig")
    public CameraConfig getCameraConfig() {
        logger.info("[Camera] add new function as a camera {} {} {}", frontpixel, backpixel, webcam);
        return this;
    }
}
