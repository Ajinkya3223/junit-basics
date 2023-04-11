package com.example.junitexample;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@Slf4j
public class CalculatorTest {

@BeforeClass
public static void init(){
  log.info("before test cases");
}

    @Test
    void testSum(){

        //expected Result
        int expectedResult= 18;
        //Actual Result
        int actualResult=Calculator.doSum(12,2,4);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    void testProduct(){
        //ExpectedResult
        int expectedResult=15;
        //ActualResult
        int actualResult=Calculator.doProduct(3,5,2);
        assertThat(actualResult).isEqualTo(expectedResult);
        Assert.assertEquals(expectedResult,actualResult);

    }


    @Test
    void testCompare(){


        boolean actualResult=Calculator.doCompare(5,5);
        assertThat(actualResult).isTrue();
    }
}
