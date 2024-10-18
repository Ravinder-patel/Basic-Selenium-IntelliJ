package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseHoverExample2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoapp.skillrary.com/index.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement course = driver.findElement(By.id("course"));
        Actions action = new Actions(driver);
        action.moveToElement(course).perform();

        WebElement selenium = driver.findElement(By.xpath("//span/a[text()='Selenium']"));
        selenium.click();

        Thread.sleep(3000);
        driver.close();
    }
}
