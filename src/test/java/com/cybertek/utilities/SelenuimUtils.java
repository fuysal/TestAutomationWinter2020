package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelenuimUtils {

    public static void verifyEquals(String expectedResult, String actualResult){

        if (expectedResult.equals(actualResult)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);

        }

    }


    public static void waitPlease(int seconds){

        try{
            Thread.sleep(seconds*1000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    //Thia method will open example page based on link name
    public static void openPage(String page, WebDriver driver){
        //We will find all examples on the home page
        List<WebElement> listOfExamples = driver.findElements(By.tagName("a"));
        for (WebElement example: listOfExamples){
            if (example.getText().contains(page)){
                example.click();
                break;
            }
        }
    }
}
