package com.codetrik.dto;

import com.codetrik.common.AMPQMessage;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@JsonPropertyOrder(alphabetic = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
public class User extends AMPQMessage{
    private String firstName;
    private String lastName;
    private String address;
}
