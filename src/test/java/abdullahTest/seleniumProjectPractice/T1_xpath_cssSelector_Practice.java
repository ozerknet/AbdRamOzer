package abdullahTest.seleniumProjectPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cydeo.utilities.WebDriverFactory;

public class T1_xpath_cssSelector_Practice {


    public static void main(String[] args)  {

        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //Locate header using cssSelector:locate parent element and move down to h2

        //a. “Home” link
        WebElement homeLink_ex1= driver.findElement(By.cssSelector("a[class='nav-link']"));
        //WebElement homeLink_ex2= driver.findElement(By.cssSelector("a.nav-link"));
        //  WebElement homeLink_ex3= driver.findElement(By.cssSelector("a[href='/']"));

        //b. “Forgot password” header
        WebElement forgetPasswordHeader1= driver.findElement(By.cssSelector("div.example>h2"));
        //WebElement forgetPasswordHeader2= driver.findElement(By.xpath("h2[.='Forgot Password']"));

        // WebElement forgetPasswordHeader3= driver.findElement(By.xpath("h2[text()='Forgot Password']"));

        //c. “E-mail” text
        WebElement emailLabel=driver.findElement(By.xpath("//label[@for='email']"));
        //d. E-mail input box
        WebElement inputBox_ex1=driver.findElement(By.xpath("//input[@name='email']"));
        //Locate inputBox using xpath contains method
        //tagName[contains(@attribute,'value')]
        //  WebElement inputBox_ex2=driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));
        //e. “Retrieve password” button
        WebElement retrievePasswordButton=driver.findElement(By.cssSelector("button[id='form_submit']"));
        // WebElement retrievePasswordButton1=driver.findElement(By.xpath("//button[@id='form_submit']"));
        // WebElement retrievePasswordButton1=driver.findElement(By.xpath("//button[@type='submit']"));
        //                                                                          "//button[@class='radius']"
        //f. “Powered by Cydeo text
        WebElement poweredByCydeoText=driver.findElement(By.xpath("//div[@style='text-align: center;']"));



        //4. Verify all web elements are displayed.
        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("forgetPasswordHeader1.isDisplayed() = " + forgetPasswordHeader1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox_ex1.isDisplayed() = " + inputBox_ex1.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());


    }
}
/* //tagName[.='text']
XPATH and CSS Selector PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible

Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible*/

