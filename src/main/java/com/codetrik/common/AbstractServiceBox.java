package com.codetrik.common;

import com.codetrik.request.AbstractServiceRequest;
import com.codetrik.response.AbstractServiceResponse;
import com.rabbitmq.client.Channel;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Getter
@Setter
public abstract class AbstractServiceBox<T extends AbstractServiceRequest, U extends AbstractServiceResponse> {
    private Channel channel;
    private Logger logger = LoggerFactory.getLogger("AbstractServiceBox");

    public AbstractServiceBox(Channel channel){
        this.channel = channel;
    }

    private void closeMqChannel(){
        try {
            this.channel.close();
        } catch (IOException | TimeoutException e) {
            logger.error("unable to close channel established for service request");
        }
    }

    public void doPostProcessing(){
        closeMqChannel();
    }
}
