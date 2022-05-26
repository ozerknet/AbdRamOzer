package OzerkCodes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyClickAccept {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://etsy.com");

        driver.findElement(By.xpath("//*[@id=\"gdpr-single-choice-overlay\"]/div/div[2]/div[2]/button")).click();


    }

}
