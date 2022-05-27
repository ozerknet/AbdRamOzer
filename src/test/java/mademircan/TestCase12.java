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

public class TestCase12 {

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

        //4. Click 'Products' button
        WebElement productButton = driver.findElement(By.xpath("//a[@href='/products']"));
        productButton.click();

        //5. Hover over first product and click 'Add to cart'
        WebElement addToCartButton = driver.findElement(By.xpath("(//a[@data-product-id='1'])[1]"));
        addToCartButton.click();

        //6. Click 'Continue Shopping' button
        WebElement continueShoppingButton = driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']"));
        continueShoppingButton.click();

        //7. Hover over second product and click 'Add to cart'
        WebElement addToCartButtonSecond = driver.findElement(By.xpath("(//a[@data-product-id='2'])[1]"));
        addToCartButtonSecond.click();

        //8. Click 'View Cart' button
        WebElement viewCartButton = driver.findElement(By.xpath("//a[@href='/view_cart']"));
        viewCartButton.click();

        //9. Verify both products are added to Cart
        List<WebElement> viewCartTable = driver.findElements(By.xpath("//table/tbody/tr"));

        Assert.assertTrue(viewCartTable.size() == 2);

        //10. Verify their prices, quantity and total price
    }


    @AfterMethod
    public void tearDownMethod() {
        // driver.close();
    }
}


