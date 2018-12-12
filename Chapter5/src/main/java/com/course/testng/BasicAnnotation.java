package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test(description = "一个最简单的测试用例")
    public void testCase1(){
        System.out.println("这是一个最简单的注解1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是一个最简单的注解2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beformethod,测试方法之前执行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("aftermethod,测试方法之后执行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeclass,类之前执行");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterclass,类之后执行");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite，类之前执行测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite，类之后执行测试套件");
    }

}
