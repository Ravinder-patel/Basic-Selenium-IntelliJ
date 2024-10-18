package Synchronization.ExplicitlyWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitVissibilityOf {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.xpath("//button[text()='Start']")).click();
        WebElement element=driver.findElement(By.xpath("//h4 [text()='Hello World!']"));
        WebDriverWait wait=new WebDriverWait(driver,20);

        String text=wait.until(ExpectedConditions.visibilityOf(element)).getText();

        System.out.println(text);

        driver.close();
    }
}
