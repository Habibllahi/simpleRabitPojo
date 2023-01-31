package com.codetrik.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public abstract class AbstractServiceResponse implements Serializable {
    private String errorMessage;
}
