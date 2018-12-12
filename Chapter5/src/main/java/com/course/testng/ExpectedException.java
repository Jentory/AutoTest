package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {


    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }


    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFaided1(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }


    //会抛异常的case
    @Test
    public void divisionWithException1() {
        int i = 1 / 0;
        System.out.println("After division the value of i is :"+ i);
    }


    //异常case处理，期望抛什么异常
    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException2() {
        int i = 1 / 0;
        System.out.println("After division the value of i is :"+ i);
    }

    //正常的方法，但是如果期望抛异常，并没有抛异常
    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException3() {
        int i = 0 / 1;
        System.out.println("After division the value of i is :"+ i);
    }
}
