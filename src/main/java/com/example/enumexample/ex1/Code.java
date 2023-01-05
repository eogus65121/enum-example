package com.example.enumexample.ex1;

import lombok.Getter;

@Getter
public enum Code {
    COMPLETE("완료", "100"),
    PROCEEDING("진행중", "200"),
    CANCEL("취소", "400"),
    WAITING("대기중", "300");

    private String statusName;
    private String code;

    Code(String statusName, String code){
        this.statusName = statusName;
        this.code = code;
    }
}
