package PopUps.FileUploadPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class ByUsingRobotClass {
    public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.naukri.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("login_Layer")).click();
        driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("ravinderpatel0606@gmail.com");
        driver.findElement(By.xpath("//input[contains(@placeholder,'password')]")).sendKeys("Insta@Ravi6619");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(@href,\"profile\")]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[contains(@class,'dummy')]")).click();
        Thread.sleep(3000);
        StringSelection str=new StringSelection("C:\\Users\\ravin\\OneDrive\\Desktop\\Resume\\RAVI0606@Naukri.pdf");
        Thread.sleep(3000);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
        Thread.sleep(3000);
        Robot r=new Robot();

        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        driver.close();

    }
}
