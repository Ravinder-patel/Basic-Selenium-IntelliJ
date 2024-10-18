package Locators.CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TagAndAttribute {
public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.edge.driver", "C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.facebook.com/");
    //TagName[Attribute=value]
    driver.findElement(By.cssSelector("input[id=email]")).sendKeys("Ravinder");
    driver.findElement(By.cssSelector("input[type=password]")).sendKeys("patelg");
    driver.findElement(By.cssSelector("button[name=login]")).click();
    Thread.sleep(3000);
    driver.close();
}
}
