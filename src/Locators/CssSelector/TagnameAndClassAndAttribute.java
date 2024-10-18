package Locators.CssSelector;

import org.openqa.selenium.*;

import org.openqa.selenium.edge.EdgeDriver;

public class TagnameAndClassAndAttribute {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        //Tagname.ClassName[AttributeName=AttributeValue]

        driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("patelg");
        driver.findElement(By.cssSelector("input.inputtext[aria-label=Password]")).sendKeys("subbulu");
        driver.findElement(By.cssSelector("Button._6lth[type=submit]")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
