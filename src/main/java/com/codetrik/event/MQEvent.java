package com.codetrik.event;

import com.codetrik.common.AMPQMessage;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Getter
@Setter
public class MQEvent<T extends AMPQMessage> {
    private Logger logger = LoggerFactory.getLogger("MQEvent");
    private T message;

    public MQEvent(T message) {
        this.message = message;
        log();
    }

    public void log(){
        logger.info("[MQ EVENT] event published");
    }
}
