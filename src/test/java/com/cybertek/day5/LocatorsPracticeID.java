package com.cybertek.day5;


import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SelenuimUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LocatorsPracticeID {

       static WebDriver driver = BrowserFactory.getDriver("chrome");

        public static void main(String[] args) throws Exception {
          test2();


        }
        //negative test, we will use wrong id to locate elemtn
        public static void test1() throws Exception{
            driver.manage().window().maximize();
            //selenuim will wait 10 secinds for element
            //if within 20 seconds, element will not show up
            //you will get NosuchElementException
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.id("woodenspoon")).click(); //NoSuchElementException, unable to locate element
            // this exception occurs when selenuim cannot find element based on provided locater.
        Thread.sleep(3000);
        driver.quit();
    }
    public static void test2() throws Exception {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(1000);
        String expectedMessage = "Welcome to the Secure Area. When you are done click logout below.";
        String actualMessage = driver.findElement(By.className("subheader")).getText();
        SelenuimUtils.verifyEquals(expectedMessage,actualMessage);
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
