package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.chrono.ThaiBuddhistEra;

public class TypeAndClick {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js=(JavascriptExecutor)driver;

        //Navigate to application
        js.executeScript("window.location=arguments[0]","https://www.amazon.in/ref=nav_logo");
        WebElement searchTexField= driver.findElement(By.name("field-keywords"));

        //Type into text field
        js.executeScript("arguments[0].value=arguments[1]",searchTexField,"ipad");
        Thread.sleep(2000);

        WebElement searchButton= driver.findElement(By.id("nav-search-submit-button"));

        //Click
        js.executeScript("arguments[0].click()",searchButton);

        Thread.sleep(2000);
        driver.close();
    }
}
