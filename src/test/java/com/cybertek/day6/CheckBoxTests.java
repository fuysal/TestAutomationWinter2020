package com.cybertek.day6;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SelenuimUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CheckBoxTests {
    static WebDriver  driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {

    }

    public static void openCheckBoxesPage(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/checkboxes");
//let's make sure that Checkboxes header is visible, not only in the cod
        WebElement checkBoxLogo = driver.findElement(By.tagName("h3"));

        if (checkBoxLogo.isDisplayed()) {
            System.out.println("logo os visible");

        }else{
            System.out.println("Logo is not visible");
        }
    }

    //verify  that checkbox 1 is not selected and checkbox 2 is selected

    public static void test1(){
        //verify  that checkbox 1 is not selected and checkbox 2 is selected

        WebElement checkBox1 = driver.findElement(By.xpath("//input[@type = 'checkbox'][1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@type = 'checkbox'][2]"));

        if (checkBox2.isSelected()){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        driver.close();
    }

    public static void test2(){

        openCheckBoxesPage();
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@type = 'checkbox'][1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@type = 'checkbox'][2]"));
        SelenuimUtils.waitPlease(2);
        checkBox1.click();
        SelenuimUtils.waitPlease(2);
        checkBox2.click();
        SelenuimUtils.waitPlease(2);

        if (checkBox1.isSelected()&& (!checkBox2.isSelected())){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        driver.close();





    }

}
