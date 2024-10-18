package ActionMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class SendKeysExample {
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.edge.driver", "C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.saucedemo.com/");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.id("user-name")).sendKeys("standard_user"+ Keys.TAB+"secret_sauce"+Keys.ENTER);
    Thread.sleep(3000);
    driver.close();
}
}
