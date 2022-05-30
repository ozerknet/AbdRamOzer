package ramazan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test7 {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = cydeo.utilities.WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void selenium_test() {
        driver.get("https://www.automationexercise.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not matching here.");
        WebElement otomatopn=driver.findElement(By.xpath("(//button[@class='btn btn-success'])[3]"));
        otomatopn.click();


        //  4. Click on 'Test Cases' button
        //
        //
        //        //5. Verify user is navigated to test cases page successfully

    }

}
