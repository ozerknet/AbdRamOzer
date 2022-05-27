package mademircan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestCase8 {

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

        //4. Click on 'Products' button
        WebElement productsButton = driver.findElement(By.xpath("//a[@href='/products']"));
        productsButton.click();

        //5. Verify user is navigated to ALL PRODUCTS page successfully
        WebElement allProducts = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        System.out.println("allProducts.isDisplayed() = " + allProducts.isDisplayed());

        //6. The products list is visible
        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='col-sm-4']"));

        for (WebElement each : productList) {

            System.out.println(productList.);

        }


//7. Click on 'View Product' of first product
//8. User is landed to product detail page
//9. Verify that detail detail is visible: product name, category, price, availability, condition, brand


    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }







}



//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
//3. Verify that home page is visible successfully
//4. Click on 'Products' button
//5. Verify user is navigated to ALL PRODUCTS page successfully
//6. The products list is visible
//7. Click on 'View Product' of first product
//8. User is landed to product detail page
//9. Verify that detail detail is visible: product name, category, price, availability, condition, brand

