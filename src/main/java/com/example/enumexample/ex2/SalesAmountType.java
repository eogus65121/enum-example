package com.example.enumexample.ex2;

import java.util.function.Function;

public enum SalesAmountType {
    ORIGINAL_AMOUNT("원금액", amount -> amount),
    SUPPLY_AMOUNT("공금가액", amount -> Math.round((double)amount * 1.1)),
    VAT_AMOUNT("부가세", amount -> Math.round((double)amount * 0.1));

    private String name;
    private Function<Long, Long> expression;

    SalesAmountType(String name, Function<Long, Long> expression){
        this.name = name;
        this.expression = expression;
    }

    public long calculate(long amount){
        return expression.apply(amount);
    }

    public String getName(){
        return name;
    }

}
