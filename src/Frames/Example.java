package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");  //configuring the property
        WebDriver driver = new EdgeDriver();    // Create reference to the edgedriver object
        driver.manage().window().maximize();    //maximising the browser window

        driver.get("https://www.snapdeal.com/products/mens-footwear-casual-shoes?sort=plrty&q=Price%3A299%2C1999%7C");    //navigate to shopping site

        WebElement signin=driver.findElement(By.className("accountUserName"));
        Actions action=new Actions(driver);
        action.moveToElement(signin).perform();
        Thread.sleep(3000);
        WebElement login=driver.findElement(By.xpath("//a[text()='login']"));
        action.moveToElement(login).click().perform();
        Thread.sleep(3000);
        WebElement mobileno=driver.findElement(By.id("userName"));
        action.moveToElement(mobileno).click().sendKeys("7032195593").perform();
        Thread.sleep(3000);
        WebElement popup= driver.findElement(By.id("close-pop"));
        action.moveToElement(popup).click().perform();

        Thread.sleep(3000);

    }
}
