package ramazan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test4 {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= cydeo.utilities.WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void window_handling() {
        driver.get("http://automationexercise.com");
        WebElement login = driver.findElement(By.xpath("//a[@href='/login']"));
        login.click();
        WebElement signVisible = driver.findElement(By.xpath("(//h2)[1]"));
        System.out.println("signVisible.isDisplayed() = " + signVisible.isDisplayed());
        WebElement signup = driver.findElement(By.xpath(" //input[@data-qa='login-email'] "));
        signup.sendKeys("r.y3833@gmail.com");
        WebElement loginPassword = driver.findElement(By.xpath("//input[@data-qa='login-password'] "));
        loginPassword.sendKeys("4556518Ry.");
        WebElement loginButton = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        loginButton.click();
        WebElement logoutButton = driver.findElement(By.xpath("//a[@href='/logout']"));
        logoutButton.click();
        WebElement loginPage = driver.findElement(By.xpath("(//h2)[1]"));
        System.out.println("loginPage.isDisplayed() = " + loginPage.isDisplayed());


    }
}
