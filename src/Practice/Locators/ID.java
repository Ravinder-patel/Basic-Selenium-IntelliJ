package Practice.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ID {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login.php");

//        WebElement byID=driver.findElement(By.id("email"));
//        byID.sendKeys("By Id Locator");
//        Thread.sleep(3000);
//        byID.clear();
//
//
//        WebElement byname = driver.findElement(By.name("email"));
//        byname.sendKeys("By Name Locator");
//        Thread.sleep(3000);
//        byname.clear();
//
//
//        WebElement byClassname = driver.findElement(By.className("inputtext"));
//        byClassname.sendKeys("By Class Name Locator");
//        Thread.sleep(3000);
//        byClassname.clear();


        WebElement byTagname = driver.findElement(By.tagName("//input"));
        byTagname.sendKeys("By tag Name Locator");
        Thread.sleep(3000);
        byTagname.clear();


        driver.close();

    }
}
