package com.cybertek.day6;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class warmUp {


    static WebDriver driver  = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) throws Exception{
        test2();

    }

    public static void test1() throws Exception{

    /*

    TEST 1
    go to amazon
    enter any search term
    click on search button
    verify title contains search term


     */

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("book");
        driver.findElement(By.className("nav-input")).click();
        String title = driver.getTitle();

        if (title.contains("book")){
            System.out.println("Passed");
        }else{
            System.out.println("failed");
        }

        driver.close();
    }

    public static void test2() throws Exception{

       /*
       TEST 2
    go to wikipedia.org
    enter search term ‘selenium webdriver’
    click on search button
    click on search result ‘Selenium (software)’
    verify url ends with ‘x'

        */

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(2000);

        driver.findElement(By.id("searchInput")).sendKeys("Selenium (software", Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.linkText("Selenium (software)")).click();
        Thread.sleep(2000);
        String url = driver.getCurrentUrl();

        if (url.endsWith("x")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        driver.close();
    }
}
