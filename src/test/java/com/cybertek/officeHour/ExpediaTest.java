package com.cybertek.officeHour;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SelenuimUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ExpediaTest {

    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) throws Exception {

    }

    public static void openHomePage(){

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.expedia.com/");
        String expectedTitle = "Expedia Travel: Search Hotels, Cheap Flights, Car Rentals & Vacations";
        String actualTitle = driver.getTitle();
        SelenuimUtils.verifyEquals(expectedTitle,actualTitle);
    }


    public static void flightTests1() throws Exception{

        driver.findElement(By.id("tab-flight-tab-hp")).click();
        driver.findElement(By.id("flight-origin-hp-flight")).sendKeys("Washington, DC (IAD-Washington Dulles Intl.)");
        driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']")).sendKeys("Houston, TX (HOU-All Airports)");
        driver.findElement(By.id("flight-departing-hp-flight")).sendKeys("9/1/2019");
        driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']")).sendKeys("10/01/2019");
        driver.findElement(By.xpath("(//button[@class='btn-primary btn-action gcw-submit'])[1]")).click();
        Thread.sleep(3000);





    }

}
