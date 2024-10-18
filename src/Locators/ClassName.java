package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClassName {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);

        driver.findElement(By.className("_55r1")).sendKeys("ravinderpurella123gmail.com");
        driver.findElement(By.className("_9npi")).sendKeys("Insta@Ravi6619");
        driver.findElement(By.className("_51sy")).click();
        Thread.sleep(3000);
        driver.close();
    }

}
