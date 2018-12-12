package com.course.testng.parameter;

import org.testng.annotations.DataProvider;

public class Parameter {

    @DataProvider(name = "dataprometer")
    public static Object[][] dataprometer(){
        return new Object[][]{
                {"zhengsan",18},
                {"lisi",19}
        };
    }
}
