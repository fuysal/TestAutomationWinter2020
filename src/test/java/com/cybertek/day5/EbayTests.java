package com.cybertek.day5;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class EbayTests {
    static WebDriver driver = BrowserFactory.getDriver("chrome");


    //Assignment
    //Go to ebay
    //enter search term
    //click on search button
    //print number of results

    public static void main(String[] args) throws Exception {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");
        // driver.findElement(By.id("gh-ac")).sendKeys("Java Book", Keys.ENTER);
        driver.findElement(By.id("gh-ac")).sendKeys("Java Book");
        driver.findElement(By.id("gh-btn")).click();// to search button
        String results = driver.findElement(By.className("srp-controls__count-heading")).getText();
        System.out.println(results);

        driver.close();


    }

}
