package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class ParameterTest2 {

    //@DataProvider注解的方法也允许使用迭代器，区别是迭代器允许你延迟创建自己的测试数据，TestNG会调用迭代器，之后测试方法会一个接一个的调用由迭代器返回的值。在你需要传递很多参数组给测试方法的时候，无须提前创建一堆值。
    //如果你声明的 @DataProvider 使用 java.lang.reflect.Method 作为第一个参数，TestNG 会把当前的测试方法当成参数传给第一个参数
    @DataProvider(name = "dp")
    public Object[][] createData(Method m) {
        System.out.println(m.getName());  // print test method name
        return new Object[][] {
                { "Cedric" }
        };
    }

    @Test(dataProvider = "dp")
    public void test1(String s) {
        System.out.println(s);
    }

    @Test(dataProvider = "dp")
    public void test2(String s) {
        System.out.println(s);
    }
}
