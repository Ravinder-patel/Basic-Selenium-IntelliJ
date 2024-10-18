package Locators.CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TagAndClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        //TagName.ClassAttributeValue
        driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Ravinder patel");
        Thread.sleep(3000);
        driver.close();
    }
}
