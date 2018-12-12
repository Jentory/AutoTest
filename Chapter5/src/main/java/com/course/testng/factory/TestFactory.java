package com.course.testng.factory;

import org.testng.annotations.Factory;

public class TestFactory {
    /*
    使用@Factory可动态地创建测试，一般用来创建一个测试类的多个实例，每个实例中的所有测试用例都会被执行，@Factory构造实例的方法必须返回Object[]。

    @DataProvider：为测试用例提供参数，有多少组参数就会执行多少次用例，因此它是让一个测试类实例的某个方法执行多次，每次执行都是同一个实例。
    @Factory：创建一个测试类的多个实例，每个实例中的所有测试用例都会被执行，每次执行采用的是不同实例。
     */
    @Factory
    public Object[] test(){
        Object[] object = new Object[2];
        for(int i=0;i<2;i++) {
            TomandyFactory tomandyFactory = new TomandyFactory(i+"000");
            object[i] = tomandyFactory;
        }
        return object;
    }
}
