package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端测试111111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端测试22222");
    }

    @Test(groups = "server")
    public void test3(){
        System.out.println("这是服务端测试33333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端测试44444");
    }

    @Test(groups = "client")
    public void test5(){
        System.out.println("这是客户端测试55555");
    }

    @BeforeGroups("server")
    public void beforeGroupOnServer(){
        System.out.println("这是服务端组运行之前运行");
    }

    @AfterGroups("server")
    public void afterGroupOnServer(){
        System.out.println("这是服务端组运行之后运行");
    }

    @BeforeGroups("client")
    public void beforeGroupOnClient(){
        System.out.println("这是客户端组运行之前运行");
    }

    @AfterGroups("client")
    public void afterGroupOnClient(){
        System.out.println("这是客户端运行之后运行");
    }

}
