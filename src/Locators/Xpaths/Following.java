package Locators.Xpaths;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class Following {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "\\C:\\Users\\ravin\\Downloads\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.icc-cricket.com/rankings/batting/mens/test");
        Thread.sleep(3000);
        WebElement rank1 =driver.findElement(By.xpath("//span[text()='Yashasvi']/following::span[text()='Rishabh']"));
        System.out.println(rank1.getText());
        Thread.sleep(3000);
        driver.close();
    }
}