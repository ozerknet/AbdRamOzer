package ramazan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test1 {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= cydeo.utilities.WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void window_handling() {
        driver.get("http://automationexercise.com");
        WebElement login= driver.findElement(By.xpath("//a[@href='/login']"));
        login.click();
        WebElement name= driver.findElement(By.xpath("//input[@type='text']"));
        name.sendKeys("ramazan yildirim"+ Keys.ENTER);
        WebElement email= driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        email.sendKeys("r.y3833@gmail.com"+ Keys.ENTER);
        WebElement text = driver.findElement(By.xpath("//b[contains(text(),'Enter Account Information')]"));
        text.click();
        System.out.println("text.isDisplayed() = " + text.isDisplayed());
        WebElement gender=driver.findElement(By.xpath("//div[@id='uniform-id_gender1']"));
        gender.click();
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.click();
        password.sendKeys("4556518Ry.");
        Select days=new Select(driver.findElement(By.xpath("//select[@id='days']")));
        days.selectByVisibleText("1");
        Select months=new Select(driver.findElement(By.xpath("//select[@id='months']")));
        months.selectByVisibleText("December");
        Select years=new Select(driver.findElement(By.xpath("//select[@id='years']")));
        years.selectByVisibleText("1990");
        WebElement click1 =driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        click1.click();
        WebElement click2 =driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        click2.click();
        WebElement namm= driver.findElement(By.xpath("//input[@data-qa='first_name']"));
        namm.sendKeys("ramazan");
        WebElement surName= driver.findElement(By.xpath("//input[@data-qa='last_name']"));
        surName.sendKeys("yildirim");
        WebElement company= driver.findElement(By.xpath("//input[@data-qa='company']"));
        company.sendKeys("Google");
        WebElement adres1 = driver.findElement(By.xpath("//input[@id='address1']"));
        adres1.sendKeys("on");
        WebElement adres2 = driver.findElement(By.xpath("//input[@id='address2']"));
        adres2.sendKeys("Richmond St  ");
        Select country= new Select(driver.findElement(By.xpath("//select[@id='country']")));
        country.selectByVisibleText("Canada");
        WebElement state = driver.findElement(By.xpath("//input[@data-qa='state']"));
        state.sendKeys("Canada");
        WebElement city = driver.findElement(By.xpath("//input[@data-qa='city']"));
        city.sendKeys("Toronto");
        WebElement zipcode = driver.findElement(By.xpath("//input[@data-qa='zipcode']"));
        zipcode.sendKeys(" 12-111");
        WebElement mobileNumber= driver.findElement(By.xpath("//input[@data-qa='mobile_number']"));
        mobileNumber.sendKeys("0033-45454-55-54");
        WebElement createAccount= driver.findElement(By.xpath("//button[@data-qa='create-account']"));
        createAccount.click();
        WebElement accountCreated= driver.findElement(By.xpath("//b[contains(text(),'Account Created!')]"));
        System.out.println("isDisplayed() = " + accountCreated.isDisplayed());
        WebElement continou= driver.findElement(By.xpath(" //a[@data-qa='continue-button']"));
        continou.click();
        WebElement deleteAcccout= driver.findElement(By.xpath("//a[@href='/delete_account'] "));
        deleteAcccout.click();

       /* WebElement signup = driver.findElement(By.xpath(" //input[@data-qa='login-email'] "));
        signup.sendKeys("r.y3832@gmail.com");
        WebElement loginPassword = driver.findElement(By.xpath("//input[@data-qa='login-password'] "));
        loginPassword.sendKeys("4556518Ry.");
        */


    }

}
