package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Example3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.skillrary.com/core-java-for-selenium-training");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement cookies= driver.findElement(By.xpath("//a[@class='close_cookies']"));
        cookies.click();
        Thread.sleep(3000);
        WebElement videoframe=driver.findElement(By.xpath("//iframe[contains(@src,'video')]"));
        driver.switchTo().frame(videoframe);
        WebElement play=driver.findElement(By.xpath("//button[@aria-label='Play']"));
        play.click();
        Thread.sleep(3000);
        WebElement pause=driver.findElement(By.xpath("//button[@aria-label='Pause']"));
        pause.click();
        driver.switchTo().defaultContent();

        Thread.sleep(3000);
        driver.close();
    }
}
