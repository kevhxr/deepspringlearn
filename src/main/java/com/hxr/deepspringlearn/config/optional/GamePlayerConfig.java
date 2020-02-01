package com.hxr.deepspringlearn.config.optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@ConfigurationProperties(prefix = "phone.gaming")
public class GamePlayerConfig {

    private int cost;
    private int capacity;
    private String graphic;

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setGraphic(String graphic) {
        this.graphic = graphic;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getGraphic() {
        return graphic;
    }

    public int getCost() {
        return cost;
    }

    private static Logger logger = LoggerFactory.getLogger(GamePlayerConfig.class);

    public GamePlayerConfig() {
    }

    @Bean("gamePlayerConfig")
    public GamePlayerConfig getGamePlayerConfig() {
        logger.info("[GamePlayer] add new function as a game player {} {} {}", cost, graphic, capacity);
        return this;
    }


}
