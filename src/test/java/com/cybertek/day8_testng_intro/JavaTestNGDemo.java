package com.cybertek.day8_testng_intro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaTestNGDemo {

    @Test
    public void test1(){
        String a = "A";
        String b = "A";
        Assert.assertEquals(a,b);

    }
    @Test
    public  void test2(){
        String str1 = "Apple";
        String str2 = "orange";
        Assert.assertEquals(str1,str2);
    }
}
