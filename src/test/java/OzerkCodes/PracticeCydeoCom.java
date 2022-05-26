package OzerkCodes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.List;

public class PracticeCydeoCom {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/");

        List<WebElement> allLinks =  driver.findElements(By.tagName("a"));

        System.out.println("allLinks.size() = " + allLinks.size());

        Array[] test = new Array[55];

        for (WebElement each : allLinks) {

            System.out.println("Text of link: " + each.getText() +" = "+ each.getAttribute("href"));
//          System.out.println("HREF Values: " + each.getAttribute("href"));


        }

        System.out.println("-------------------------------------------");
       /*
        for (WebElement each : allLinks) {
            if(each.getText().toLowerCase().startsWith("a")){
                System.out.println(each.getText()+ " = " +each.getAttribute("href"));
            }
        }
        */


        driver.close();


    }
}
