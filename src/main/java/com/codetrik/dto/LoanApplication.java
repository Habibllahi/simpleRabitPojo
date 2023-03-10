package com.codetrik.dto;

import com.codetrik.common.AMPQMessage;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonPropertyOrder(alphabetic = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
public class LoanApplication extends AMPQMessage {
    private String name;
    private String whatFor;
    private Double amount;
    private Response response;
}
