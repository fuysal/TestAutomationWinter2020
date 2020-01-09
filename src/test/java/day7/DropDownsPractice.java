package day7;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SelenuimUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownsPractice {
    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        openDropDownPage();
        test1();
        driver.close();
    }

    public static void openDropDownPage() {

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement element = driver.findElement(By.xpath("//h3[text()='Dropdown List']"));
        SelenuimUtils.verifyIsDisplayed(element);

    }

    public static void test1() {
        WebElement dropdown1 = driver.findElement(By.id("dropdown"));

        //to work with select elements
        //we need to use Select class
        //don't forget to pass web element of that dropdown that you found into constructor
        Select dropdownSleect = new Select(dropdown1);
        //since dropdown consists of options
        //we can check which one is selected
        //getFirstSelectedOption() return webelement, use getText() method if
        //you want to get a text of this option, Usally, text is a visible part of
        //dropdown. Value or other attributes of drop down, not visible.
        String actual = dropdownSleect.getFirstSelectedOption().getText();
        String expected = "Please select an option";
        SelenuimUtils.verifyEquals(expected, actual);
        //we can get list of options that are present in the dropdown
        List<WebElement> options = dropdownSleect.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

    }

    public static void test2() {
        WebElement dropdownState = driver.findElement(By.id("state"));
        Select dropDownSelect = new Select(dropdownState);
        List<WebElement> states = dropDownSelect.getOptions();
        for (WebElement element : states) {
            System.out.println(element.getText());
        }
        //let's select virginia
        //we have to use object of Select class
        dropDownSelect.selectByVisibleText("Virginia");
        SelenuimUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("Texas");
        SelenuimUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("California");
        SelenuimUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("Kansas");
        SelenuimUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("New Jersey");
        SelenuimUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("Florida");
        SelenuimUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("Tennessee");
        SelenuimUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("Ohio");
        SelenuimUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("Colorado");
        SelenuimUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("Nebraska");
        SelenuimUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("Arkansas");
        SelenuimUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("District Of Columbia");
        SelenuimUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("Pennsylvania");
    }

    public static void test3() {

        WebElement dropdownState = driver.findElement(By.id("state"));
        //object of select class
        //it has methods that helps to work with drop downs
        Select dropDownSelect = new Select(dropdownState);
        //we found all options that are available to select
        List<WebElement> states = dropDownSelect.getOptions();
        //we loop through all options
        for (WebElement option : states) {
            SelenuimUtils.waitPlease(1);
            //and select every option by text
            //<option value="PA">Pennsylvania</option>
            //means find option that has text Pennsylvania and select it
            dropDownSelect.selectByVisibleText(option.getText());
        }
    }

    //select by value
    public static void test4() {
        WebElement dropdownState = driver.findElement(By.id("state"));

        Select dropDownSelect = new Select(dropdownState);
        //<option value="PA">Pennsylvania</option>
        //means find option that has value PA and select it
        dropDownSelect.selectByValue("PA");
        SelenuimUtils.waitPlease(2);
        String expected = "Pennsylvania";

        String actual = dropDownSelect.getFirstSelectedOption().getText();
        SelenuimUtils.verifyEquals(expected, actual);


    }

    //select by index
    public static void test5() {

        WebElement dropdownState = driver.findElement(By.id("state"));

        Select dropDownSelect = new Select(dropdownState);
        SelenuimUtils.waitPlease(2);
        dropDownSelect.selectByIndex(5);
        SelenuimUtils.waitPlease(2);



    }

    //multiple select
    public static void  test6(){
        WebElement multipleSelectionWebElement = driver.findElement(By.xpath("//select[@name='Languages']"));

        Select multipleSelectionSelect = new Select(multipleSelectionWebElement);

        SelenuimUtils.waitPlease(2);
        multipleSelectionSelect.selectByVisibleText("Java");
        SelenuimUtils.waitPlease(2);
        multipleSelectionSelect.selectByVisibleText("JavaScript");
        SelenuimUtils.waitPlease(2);


    }
}
