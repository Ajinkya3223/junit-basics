//package com.example.junitexample;
//
//import lombok.extern.slf4j.Slf4j;
//import org.junit.AfterClass;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//@Slf4j
//public class CalculatorTest {
//
//@BeforeClass
//public static void init(){
//    /** this method should be static beacuse its classlevel method **/
// log.info("Starting the  test cases");
// System.out.println("before");
//
//}
//
//@Before
//public void beforeEach(){
//    /** this method will exexcute before each test case**/
//    log.info("before each testcase");
//}
//
//    @Test
//    void testSum(){
//System.out.println("in test sum test" );
//log.info("in test sum");
//        //expected Result
//        int expectedResult= 18;
//        //Actual Result
//        int actualResult=Calculator.doSum(12,2,4);
//
//        assertThat(actualResult).isEqualTo(expectedResult);
//    }
//    @Test
//    void testProduct(){
//        //ExpectedResult
//        int expectedResult=15;
//        //ActualResult
//        int actualResult=Calculator.doProduct(3,5,1);
//        assertThat(actualResult).isEqualTo(expectedResult);
//        Assert.assertEquals(expectedResult,actualResult);
//
//    }
//
//
//    @Test
//    void testCompare(){
//
//
//        boolean actualResult=Calculator.doCompare(5,5);
//        assertThat(actualResult).isTrue();
//    }
//
//    @AfterClass
//    public static void cleanup(){
//    /** this method should be static beacuse its classlevel method **/
//    log.info("after all test cases");
//    System.out.println("compleetd");
//    }
//}
