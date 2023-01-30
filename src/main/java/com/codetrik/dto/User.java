package com.codetrik.dto;

import com.codetrik.common.AMPQMessage;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@JsonPropertyOrder(alphabetic = true)
@Getter
@Setter
@NoArgsConstructor
public class User extends AMPQMessage implements Serializable {
    private String firstName;
    private String lastName;
    private String address;
}
