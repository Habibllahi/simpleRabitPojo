package com.codetrik.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractServiceResponse {
    private String errorMessage;
}
