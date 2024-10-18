package Synchronization.ExplicitlyWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebDriverWaitElementToBeClickable {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.instagram.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement button=driver.findElement(By.xpath("//button[.='Log in']"));
        WebDriverWait wait=new WebDriverWait(driver,10);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(button)).click();
            System.out.println("Button is enabled");
        }
        catch (Exception e){
            System.out.println("Button is not enabled");
            //driver.close();
        }
        finally {
            driver.close();
        }
        //driver.close();
    }
}
