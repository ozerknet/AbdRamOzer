package ramazan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Mail {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
        WebElement click= driver.findElement(By.id("L2AGLb"));
        click.click();
        WebElement gmail= driver.findElement(By.className("gb_d"));
        gmail.click();
        String expectedTitle= "Gmail";
        String getTitle= driver.getTitle();
        System.out.println(getTitle);
        if(driver.getTitle().contains(expectedTitle)){
            System.out.println("T1 PASSED");
        }else{
            System.out.println("T1 FAILED");
        }
        driver.navigate().back();
        String lastTitle= "Google";
        if(driver.getTitle().equals(lastTitle)){
            System.out.println("T2 PASSED");
        }else{
            System.out.println("T2 FAILED");
        }



    }
}
