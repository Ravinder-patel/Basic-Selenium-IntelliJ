package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Name {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("ravinder");
        driver.findElement(By.name("pass")).sendKeys("458961258");
        driver.findElement(By.name("login")).click();
        Thread.sleep(3000);

        driver.close();

    }
}
