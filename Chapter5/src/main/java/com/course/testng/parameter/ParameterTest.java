package com.course.testng.parameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void test(@Optional("Tom") String name, int age){
        System.out.println("name = "+name+" age = "+age);
    }
}
