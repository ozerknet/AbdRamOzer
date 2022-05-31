package ramazan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test5 {
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
        WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
        name.sendKeys("ramazan yildirim" + Keys.ENTER);
        WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        email.sendKeys("r.y3833@gmail.com" + Keys.ENTER);
       // WebElement text = driver.findElement(By.xpath("//b[contains(text(),'Enter Account Information')]"));
       // text.click();
        WebElement alreadyExist= driver.findElement(By.xpath(" //p[@style='color: red;']"));
        System.out.println("alreadyExist.isDisplayed() = " + alreadyExist.isDisplayed());
        System.out.println("alreadyExist.isSelected() = " + alreadyExist.isSelected());

        //p[@style='color: red;']
    }
}
