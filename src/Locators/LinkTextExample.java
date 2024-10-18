package Locators;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkTextExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        //driver.findElement(By.linkText("Contact uploading and non-users")).click();

        WebElement link=driver.findElement(By.linkText("Contact uploading and non-users"));
        System.out.println("Clicked on : "+link.getText());
        link.click();
        Thread.sleep(3000);

        driver.close();
    }
}
