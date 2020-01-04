package com.cybertek.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class OfficeHour {
    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");
        driver.manage().window().maximize();


        String pageTitle = driver.getTitle();

        if (pageTitle.contains("Google")){
            System.out.println("passed");
        }else{
            System.out.println("Failed");
           // new Actions(driver).pause(3000).perform();
            Thread.sleep(3000);
        }
        System.out.println("test completed");
    }
}
