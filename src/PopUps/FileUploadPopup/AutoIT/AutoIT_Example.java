package PopUps.FileUploadPopup.AutoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AutoIT_Example {
    public static void main(String[] args) throws InterruptedException, IOException {
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
        Thread.sleep(5000);

        Runtime.getRuntime().exec("C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\AutoITFiles\\NaukriResumeUpload_x64.exe");
        Thread.sleep(3000);
        driver.close();
    }
}
