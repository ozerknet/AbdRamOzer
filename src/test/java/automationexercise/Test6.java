package automationexercise;

import cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test6 {
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

        //4. Click on 'Contact Us' button
        WebElement contactUsButton = driver.findElement(By.xpath("//a[@href='/contact_us']"));
        contactUsButton.click();

        //5. Verify 'GET IN TOUCH' is visible
        WebElement getInTouch = driver.findElement(By.xpath("//*[.='Get In Touch']"));
        System.out.println("getInTouch.isDisplayed() = " + getInTouch.isDisplayed());

        //6. Enter name, email, subject and message
        WebElement nameInput = driver.findElement(By.xpath("//input[@placeholder='Name']"));
        nameInput.sendKeys("Ozer");

        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
        emailInput.sendKeys("alibaba@getir.com");

        WebElement subjectInput = driver.findElement(By.xpath("//input[@placeholder='Subject']"));
        subjectInput.sendKeys("Claim");

        WebElement messageInput = driver.findElement(By.xpath("//textarea[@placeholder='Your Message Here']"));
        messageInput.sendKeys("My order did not arrive. I want to speak one of person as soon as possible");

        //7. Upload file

        WebElement uploadFileButton = driver.findElement(By.xpath("(//input[@class='form-control'])[4]"));
        uploadFileButton.sendKeys("C:\\Users\\Polipost\\Desktop\\1.jpg");

        //8. Click 'Submit' button
        WebElement submitButton = driver.findElement(By.xpath("//input[@data-qa='submit-button']"));
        submitButton.click();

        //9. Click OK button
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        WebElement succesMesssage = driver.findElement(By.xpath("//div[@class=\"status alert alert-success\"]"));
        System.out.println("succesMesssage.isDisplayed() = " + succesMesssage.isDisplayed());

        //11. Click 'Home' button and verify that landed to home page successfully

        WebElement homePageButton = driver.findElement(By.xpath("(//a[@href='/'])[3]"));
        homePageButton.click();
        System.out.println("(driver.getTitle().equals(expectedTitle)) = " + (driver.getTitle().equals(expectedTitle)));

    }


    @AfterMethod
    public void tearDownMethod() {
        //driver.close();
    }
}
/*
Steps:

Test Case 6: Contact Us Form
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Contact Us' button
5. Verify 'GET IN TOUCH' is visible
6. Enter name, email, subject and message
7. Upload file
8. Click 'Submit' button
9. Click OK button
10. Verify success message 'Success! Your details have been submitted successfully.' is visible
11. Click 'Home' button and verify that landed to home page successfully
 */
