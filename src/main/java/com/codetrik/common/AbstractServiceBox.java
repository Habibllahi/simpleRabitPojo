package com.codetrik.common;

import com.codetrik.request.AbstractServiceRequest;
import com.codetrik.response.AbstractServiceResponse;
import com.rabbitmq.client.Channel;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;

@Getter
@Setter
public abstract class AbstractServiceBox<T extends AbstractServiceRequest, U extends AbstractServiceResponse> {
    private Channel channel;
    private T serviceRequest;
    private U serviceResponse;
    private ExecutorService executorService;

    private Logger logger = LoggerFactory.getLogger("AbstractServiceBox");

    public AbstractServiceBox(T serviceRequest, U serviceResponse){
        this.serviceRequest = serviceRequest;
        this.serviceResponse = serviceResponse;
    }

    private void closeMqChannel(){
        try {
            if(channel != null && channel.isOpen()){
                this.channel.close();
            }
        } catch (IOException | TimeoutException e) {
            this.logger.error("unable to close MQ channel established for service request");
        }
    }

    public Future<?> asyncSubmitProcess(Runnable task){
        return this.executorService.submit(task);
    }

    public <V> Future<V> asyncCallProcess(Callable<V> task){
        return this.executorService.submit(task);
    }

    public void doPostProcessing(){
        closeMqChannel();
    }
}
