package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ID {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);

        driver.findElement(By.id("email")).sendKeys("ravinderpur3@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("ravi@123");
        //driver.findElement(By.id("u_0_5_ae")).click();
        Thread.sleep(4000);

        driver.close();
    }

}
