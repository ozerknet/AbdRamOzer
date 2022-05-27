package mademircan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase10 {

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

        //4. Scroll down to footer
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10522)", "");

        //5. Verify text 'SUBSCRIPTION'
        WebElement subscriptionText = driver.findElement(By.xpath("//h2[.='Subscription']"));
        subscriptionText.isDisplayed();


        //6. Enter email address in input and click arrow button
        WebElement emailInputBox = driver.findElement(By.xpath("//input[@id='susbscribe_email']"));
        emailInputBox.sendKeys("mehmet@gotur.com");
        WebElement arrowClick = driver.findElement(By.xpath("//button[@id='subscribe']"));
        arrowClick.click();


        //7. Verify success message 'You have been successfully subscribed!' is visible
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='alert-success alert']"));
        System.out.println("successMessage.isDisplayed() = " + successMessage.isDisplayed());


    }






    @AfterMethod
    public void tearDownMethod() {
      //  driver.close();



    }

}
