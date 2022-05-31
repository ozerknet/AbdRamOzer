package ramazan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test10 {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= cydeo.utilities.WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void window_handling() {
        driver.get("http://automationexercise.com");
        WebElement products = driver.findElement(By.xpath("//a[@href='/products']"));
        products.click();
        WebElement subscription = driver.findElement(By.xpath("//h2[.='Subscription']"));
        //System.out.println("subscription.isDisplayed() = " + subscription.isDisplayed());
        WebElement subscriptionEmail = driver.findElement(By.xpath("//input[@id='susbscribe_email']"));
        subscriptionEmail.sendKeys("r.y3433@gmail.com");
        WebElement subs = driver.findElement(By.xpath("//button[@id='subscribe']"));
        subs.click();




    }
}
