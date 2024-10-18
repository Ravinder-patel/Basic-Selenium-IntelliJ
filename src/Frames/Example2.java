package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.co.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement CalloutFrame= driver.findElement(By.xpath("//iframe[@name='callout']"));
        driver.switchTo().frame(CalloutFrame);
        WebElement signOut= driver.findElement(By.xpath("//button[contains(.,'Stay signed out')]"));
        signOut.click();
        driver.switchTo().defaultContent();
        WebElement searchBox= driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        searchBox.sendKeys("pushpa 2"+Keys.ENTER);
       Thread.sleep(3000);
       driver.close();
    }
}
