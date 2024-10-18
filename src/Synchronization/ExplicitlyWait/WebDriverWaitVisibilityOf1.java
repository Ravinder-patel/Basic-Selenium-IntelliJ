package Synchronization.ExplicitlyWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitVisibilityOf1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Dynamic Loading']")).click();
        driver.findElement(By.xpath("//a[contains(.,'hidden')]")).click();
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        WebElement e1=driver.findElement(By.xpath("//h4[contains(.,'Hello')]"));
        WebDriverWait wait=new WebDriverWait(driver,10);
        String text =wait.until(ExpectedConditions.visibilityOf(e1)).getText();
        System.out.println("Hidden Text: "+text);
       // System.out.println("Hidden Text: "+wait.until(ExpectedConditions.visibilityOf(e1)).getText());

        driver.close();
    }
}
