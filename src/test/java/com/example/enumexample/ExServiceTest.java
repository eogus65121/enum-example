package com.example.enumexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExServiceTest {

    private final ExService svc = new ExService();

    @Test
    void ex1Test(){
        assertEquals("100", svc.ex1Svc("COMPLETE"));
    }

    @Test
    void ex2Test(){
        long result = svc.ex2Svc(10000l);
        long expect = 1000l;
        assertEquals(expect, result);
    }

    @Test
    void ex3Test(){
        assertEquals("카드", svc.ex3Svc("PAYCO"));
    }
}
