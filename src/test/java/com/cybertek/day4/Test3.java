package com.cybertek.day4;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

    public static void main(String[] args) throws Exception {
        //this line replaces System.setProperty("webdriver","path to the webdriver)
        WebDriverManager.chromedriver().setup(); // setup webdriver
        // driver will give access to the browser
        WebDriver driver = new ChromeDriver();// create object of chrome driver
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInputBox = driver.findElement(By.name("email")); //we found input box
        WebElement submitButton = driver.findElement(By.id("form_submit"));// we found the submit button

       emailInputBox.sendKeys("sdetpro3000@gmail.com");// enter text into input box

        System.out.println(emailInputBox.getAttribute("pattern"));
        System.out.println(emailInputBox.getAttribute("value"));
       submitButton.submit();// it only works only with buttons. Click method is more flexible

        Thread.sleep(3000);
        driver.close();
    }


}
