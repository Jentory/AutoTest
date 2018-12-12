package com.course.testng.parameter;

import org.testng.annotations.Test;

public class ParameterTest1 {

    @Test(dataProvider = "dataprometer",dataProviderClass=Parameter.class)
    public void test1(String name,int age){
        System.out.println("name = "+name+"; age = "+age);
    }
}
