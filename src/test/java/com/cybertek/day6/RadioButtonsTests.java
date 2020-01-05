package com.cybertek.day6;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SelenuimUtils;
import jdk.nashorn.internal.runtime.regexp.joni.constants.TargetInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class RadioButtonsTests {
    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        openRadioButtonPage();
        test2();
        driver.close();


    }

    public static void openRadioButtonPage() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/radio_buttons");

    }


    public static void test1() {
        //let's check if blue radio button is selected

        WebElement blueBtn = driver.findElement(By.id("blue"));
        if (blueBtn.isSelected()) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        SelenuimUtils.waitPlease(2);


    }
    //let's check that green button is disabled, that means not clickable
    // and black button is clickable

    public static void test2() {
        WebElement blackBtn = driver.findElement(By.id("black"));
        WebElement greenBtn = driver.findElement(By.id("green"));

        if (blackBtn.isEnabled() && !greenBtn.isEnabled()) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        SelenuimUtils.waitPlease(2);
    }

    //TASK!
    //write a test(method) that will do following:
    //verify that blue button is selected
    //then click on black button
    //verify that black button is selected
    //verify that blue button is not selected
    public static void test3() {
        WebElement blueBtn = driver.findElement(By.id("blue"));
        if (blueBtn.isSelected()) {
            System.out.println("passed");
            System.out.println("Blue button is sleected");
        } else {
            System.out.println("failed");
            System.out.println("Blue is not selected");
        }

        WebElement blackBtn = driver.findElement(By.id("black"));
        SelenuimUtils.waitPlease(2);
        blackBtn.click();
        SelenuimUtils.waitPlease(2);

        if (blackBtn.isSelected()) {
            System.out.println("passed");
            System.out.println("blue is selected");
        } else {
            System.out.println("failed");
            System.out.println("Black is not selected");
        }
        // ! means opposite. To check if blue button
        //is not selected any more
        //based on requirements, we canot have more
        //then one favorite color
        if (!blueBtn.isSelected()) {
            System.out.println("PASSED");
            System.out.println("Blue is not selected");
        } else {
            System.out.println("FAILED");
            System.out.println("Blue is selected!");
        }

        //Let's write a test
        //that will make sure
        //that only one radio button is selected
        //public static void test4 () {
        // lets find all radio
        }
    }
}