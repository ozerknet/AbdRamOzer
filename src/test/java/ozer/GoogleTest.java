package ozer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");


        WebElement agreeButton = driver.findElement(By.id("L2AGLb"));
        agreeButton.click();// used to click on any button

        Thread.sleep(3000);

        WebElement gmailButtonElement = driver.findElement(By.className("gb_d"));
        gmailButtonElement.click();
        //Gmail: Free, Private & Secure Email | Google Workspace

        String expectedTitle = "Gmail: Free, Private & Secure Email | Google Workspace";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAIL!!!");
        }
    }
}
