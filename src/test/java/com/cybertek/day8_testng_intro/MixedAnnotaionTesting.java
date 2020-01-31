package com.cybertek.day8_testng_intro;

import org.testng.annotations.*;

public class MixedAnnotaionTesting {


    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }

    @BeforeMethod
    public void setup(){
        System.out.println("Before method");
    }

    @Test
    public void test1(){
        System.out.println("I am a test1!");
    }

    @Test
    public void test2(){
        System.out.println("I am a test2!");
    }

}
