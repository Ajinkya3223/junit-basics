package com.example.junitexample;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

@Slf4j
public class CalculatorTestJunit5 {
    @BeforeAll
    public static void init(){
        /** this mehtod must be static**/
        log.info("before all test cases this mthod will run");
    }
    @Test
    @DisplayName("doSum")
    @Disabled
    public void doSumTest(){
       int ActualResult= Calculator.doSum(2,2,3);
        int ExepctedResult=7;
        Assertions.assertEquals(ExepctedResult,ActualResult,"data not matched");
      //  Assertions.assertSame();
       // Assertions.assertNotSame();
        log.info("performing  dosumtest");
    }
    @AfterAll


    public static void cleanup(){
        log.info("After all test cases ");
    }
}
