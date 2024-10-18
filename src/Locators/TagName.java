package Locators;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class TagName {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.co.in/");
        driver.findElement(By.tagName("textarea")).sendKeys("ravi");
        Thread.sleep(3000);
        driver.findElement(By.tagName("input")).click();
        Thread.sleep(3000);

        driver.close();
    }
}
