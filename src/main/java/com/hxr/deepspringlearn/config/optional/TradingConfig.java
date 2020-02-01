package com.hxr.deepspringlearn.config.optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@ConfigurationProperties(prefix = "phone.trading")
public class TradingConfig {

    private static Logger logger = LoggerFactory.getLogger(TradingConfig.class);

    private String bank;

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBank() {
        return bank;
    }

    @Bean("tradingConfig")
    public TradingConfig getTradingConfig() {
        logger.info("[Trading] add new trading function {}", bank);
        return this;
    }
}
