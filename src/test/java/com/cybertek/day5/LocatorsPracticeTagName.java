package com.cybertek.day5;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsPracticeTagName {
        static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) throws Exception{
        //Task: Find all buttons, put them in the lsit, and click on them by one by one.
        test1();

        }

    public static void test1() throws Exception{
        driver.manage().window().maximize();
        //Selenuim will wait up to 30 seconds to find element
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        // how to find all buttons
        // we use findElements to find multiple elements
        //then we have to store them in the list

        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        System.out.println("Size:" + buttons.size());// to get how many elements in the list
        for (WebElement button: buttons){
            System.out.println(button.getText());
            button.click();
            Thread.sleep(1000);
        }

        driver.close();
        }
    }

