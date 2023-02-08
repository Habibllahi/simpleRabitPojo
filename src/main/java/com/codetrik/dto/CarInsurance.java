package com.codetrik.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarInsurance extends Insurance {
    private String registration;
    private int millage;
}
