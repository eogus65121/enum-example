package com.example.enumexample.ex3;

import lombok.Getter;

@Getter
public enum PayType {

    ACCOUNT_TRANSFER("계좌이체"),
    REMITTANCE("무통장입금"),
    ON_SITE_PAYMENT("현장결제"),
    TOSS("토스"),
    PAYCO("페이코"),
    CARD("신용카드"),
    KAKAO_PAY("카카오페이"),
    BAEMIN_PAY("배민페이");

    private String title;

    PayType(String title){
        this.title = title;
    }
}
