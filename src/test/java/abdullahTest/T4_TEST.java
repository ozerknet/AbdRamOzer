package abdullahTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cydeo.utilities.WebDriverFactory;


public class T4_TEST {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //Locate header using cssSelector:locate parent element and move down to h2

        //a. “Home” link
//        WebElement homeLink_ex1= driver.findElement(By.cssSelector("a[class='nav-link']"));
//        WebElement homeLink_ex2= driver.findElement(By.cssSelector("a.nav-link"));
       // WebElement homeLink_ex1= driver.findElement(By.cssSelector("a[class='nav-link']"));
       // WebElement homeLink_ex2= driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink_ex3= driver.findElement(By.cssSelector("a[href='/']"));

        //b. “Forgot password” header
       // WebElement forgetPasswordHeader1= driver.findElement(By.cssSelector("div.example>h2"));

//        WebElement forgetPasswordHeader2= driver.findElement(By.xpath("h2[.='Forgot Password'"));
//
//        WebElement forgetPasswordHeader3= driver.findElement(By.xpath("h2[text()='Forgot Password'"));
        WebElement forgetPasswordHeader2= driver.findElement(By.xpath("//h2[.='Forgot Password']"));

      // WebElement forgetPasswordHeader3= driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

    }
}
