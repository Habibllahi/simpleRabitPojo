package com.codetrik.request;

import com.codetrik.dto.CarInsurance;
import com.codetrik.dto.LoanApplication;
import com.codetrik.dto.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic = true)
@Getter
@Setter
@NoArgsConstructor
public class UserServiceRequest extends  AbstractServiceRequest{
    private User user;
    private LoanApplication loanApplication;
    private CarInsurance carInsurance;
}
