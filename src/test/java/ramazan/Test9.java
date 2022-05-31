package ramazan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test9 {
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
        WebElement allProducts = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        String productsX=allProducts.getText();
        String expected="ALL PRODUCTS";
        WebElement x  = driver.findElement(By.xpath(" //input[@id='search_product'] "));
        System.out.println("x.isDisplayed() = " + x.isDisplayed());




    }
}
