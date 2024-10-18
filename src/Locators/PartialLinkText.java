package Locators;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class PartialLinkText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        //driver.findElement(By.partialLinkText("Contact")).click();
        WebElement Partial=driver.findElement(By.partialLinkText("Contact"));
        System.out.println("Clicked on : "+Partial.getText());
        Partial.click();

        Thread.sleep(3000);
        driver.close();
    }
}
