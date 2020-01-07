package day7;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SelenuimUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class DropDownsPractice {
    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {

    }

    public static void openDropDownpage() {

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement element = driver.findElement(By.xpath("//h3[text()='Dropdown List']"));

    }

    public static void test1() {
        WebElement dropdown1 = driver.findElement(By.id("dropdown"));
    }
}
