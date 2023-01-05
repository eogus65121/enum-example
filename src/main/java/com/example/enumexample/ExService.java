package com.example.enumexample;

import com.example.enumexample.ex1.Code;
import com.example.enumexample.ex2.SalesAmountType;
import com.example.enumexample.ex3.PayGroup;
import com.example.enumexample.ex3.PayType;

public class ExService {

    //ex1
    public String ex1Svc(String statusName){
        return Code.valueOf(statusName).getCode();
    }

    //ex2
    public Long ex2Svc(long amt){
        return SalesAmountType.VAT_AMOUNT.calculate(amt);
    }

    //ex3
    public String ex3Svc(String payName){
        PayType payType = PayType.valueOf(payName);
        PayGroup payGroup = PayGroup.findByPayCode(payType);
        return payGroup.getTitle();
    }
}
