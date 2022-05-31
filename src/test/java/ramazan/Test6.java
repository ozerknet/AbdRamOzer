package ramazan;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test6 {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= cydeo.utilities.WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void window_handling() {
        driver.get("http://automationexercise.com");
        WebElement contactUs = driver.findElement(By.xpath(" //a[@href='/contact_us']"));
        contactUs.click();
        WebElement getInTouch = driver.findElement(By.xpath("  (//h2)[1]"));
        System.out.println("getInTouch.isDisplayed() = " + getInTouch.isDisplayed());
        WebElement name = driver.findElement(By.xpath("   //input[@data-qa='name'] "));
        name.sendKeys("ramazan");
        WebElement email = driver.findElement(By.xpath("   //input[@data-qa='email'] "));
        email.sendKeys("r.y3832@gmail.com");
        WebElement subject = driver.findElement(By.xpath("  //input[@name='subject'] "));
        subject.sendKeys("issue");
        WebElement message = driver.findElement(By.xpath("  //textarea[@data-qa='message'] "));
        message.sendKeys("Im  getting problem with this file. can you  sort it out");
        WebElement upload= driver.findElement(By.xpath("//input[@name='upload_file']"));
        WebElement submit= driver.findElement(By.xpath("//input[@data-qa='submit-button']"));
        submit.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement succesMesssage = driver.findElement(By.xpath("//div[@class=\"status alert alert-success\"]"));
        System.out.println("succesMesssage.isDisplayed() = " + succesMesssage.isDisplayed());
        WebElement homePageButton = driver.findElement(By.xpath("(//a[@href='/'])[3]"));
        homePageButton.click();









    }
}
