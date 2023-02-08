package com.codetrik.dto;

import com.codetrik.common.AMPQMessage;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Insurance extends AMPQMessage {
    private double price;
}
