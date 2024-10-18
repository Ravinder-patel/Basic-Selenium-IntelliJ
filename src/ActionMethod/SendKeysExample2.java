package ActionMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class SendKeysExample2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/login.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement fb= driver.findElement(By.partialLinkText("Forgotten"));
        fb.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
        Thread.sleep(3000);
        fb.sendKeys(Keys.chord(Keys.CONTROL,Keys.TAB));

        Thread.sleep(3000);
        driver.quit();
    }
}
