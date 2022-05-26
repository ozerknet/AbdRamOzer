package cydeo.automationexercise;

import com.google.common.base.Verify;
import cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test5 {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void selenium_test() {
        //3. Verify that home page is visible successfully
        driver.get("https://www.automationexercise.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not matching here.");

        //4. Click on 'Signup / Login' button
        WebElement signupLoginButton = driver.findElement(By.xpath("//a[@href='/login']"));
        signupLoginButton.click();

        //5. Verify 'New User Signup!' is visible
        WebElement newUserSignup = driver.findElement(By.xpath("//h2[contains(text(),'New User Signup!')]"));
        System.out.println("newUserSignup.isDisplayed() = " + newUserSignup.isDisplayed());

        //6. Enter name and already registered email address
        WebElement nameArea = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        nameArea.sendKeys("ozer" + Keys.ENTER);

        WebElement emailArea = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        emailArea.sendKeys("mike121@geldi.com");

        //7. Click 'Signup' button
        WebElement signupButton = driver.findElement(By.xpath("//button[contains(text(),'Signup')]"));
        signupButton.click();

        //8. Verify error 'Email Address already exist!' is visible
        WebElement emailAddressAlreadyExit = driver.findElement(By.xpath("//p[contains(text(),'Email Address already exist!')]"));
        System.out.println("emailAddressAlreadyExit.isDisplayed() = " + emailAddressAlreadyExit.isDisplayed());

    }


    @AfterMethod
    public void tearDownMethod() {
       // driver.close();
    }
}

/*
Steps:
Test Case 5: Register User with existing email
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and already registered email address
7. Click 'Signup' button
8. Verify error 'Email Address already exist!' is visible
 */
