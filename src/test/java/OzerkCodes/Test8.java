package OzerkCodes;

import cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test8 {
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


        //4. Click on 'Products' button
        WebElement productsButton = driver.findElement(By.xpath("//a[@href='/products']"));
        productsButton.click();

        //5. Verify user is navigated to ALL PRODUCTS page successfully
        WebElement allProductsText = driver.findElement(By.xpath("//*[.='All Products']"));
        System.out.println("allProductsText.isDisplayed() = " + allProductsText.isDisplayed());

        //6. The products list is visible ???

        //7. Click on 'View Product' of first product
        WebElement viewProductOfFirstProductButton = driver.findElement(By.xpath("//a[@href='/product_details/1']"));
        viewProductOfFirstProductButton.click();

        //8. User is landed to product detail page
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.automationexercise.com/product_details/1";

        //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
        WebElement productNameText = driver.findElement(By.xpath(""));
        System.out.println("productNameText.isDisplayed() = " + productNameText.isDisplayed());
        WebElement productCategoryText = driver.findElement(By.xpath("//*[.='Blue Top']"));
        System.out.println("productCategoryText.isDisplayed() = " + productCategoryText.isDisplayed());
        WebElement productPriceText = driver.findElement(By.xpath("//*[.='Rs. 500']"));
        System.out.println("productPriceText.isDisplayed() = " + productPriceText.isDisplayed());
        WebElement productAvailabilityText = driver.findElement(By.xpath("//b[.='Availability:']"));
        System.out.println("productAvailabilityText.isDisplayed() = " + productAvailabilityText.isDisplayed());
        WebElement productConditionText = driver.findElement(By.xpath("//b[.='Condition:']"));
        System.out.println("productConditionText.isDisplayed() = " + productConditionText.isDisplayed());
        WebElement productBrandText = driver.findElement(By.xpath("//b[.='Brand:']"));
        System.out.println("productBrandText.isDisplayed() = " + productBrandText.isDisplayed());

    }


    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }
}



/*
Steps:
Test Case 8: Verify All Products and product detail page
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Products' button
5. Verify user is navigated to ALL PRODUCTS page successfully
6. The products list is visible
7. Click on 'View Product' of first product
8. User is landed to product detail page
9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
 */
