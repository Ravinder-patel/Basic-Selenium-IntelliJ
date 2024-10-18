package WebElementMethods.GetterMethods;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GetScreenshotExample {
    public static void main(String[] args) throws InterruptedException, IOException {
        //System.setProperty("webdriver.edge.driver", "C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        WebDriver driver2=new ChromeDriver();

        driver.manage().window();
        driver2.manage().window();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.netflix.com/in/");
        driver2.get("https://www.netflix.com/in/");
        WebElement image=driver.findElement(By.className("basicLayout"));
        WebElement image2=driver.findElement(By.className("basicLayout"));
        File src = image.getScreenshotAs(OutputType.FILE);
        File src2 = image2.getScreenshotAs(OutputType.FILE);
        File dest=new File("./Screenshots/NetflixEdge.png");
        File dest2=new File("./Screenshots/NetflixChrome.png");
        //File dest=new File("D:\\MOVIES\\zomato.png"); //if we want to store in specific location
        FileUtils.copyFile(src,dest);
        FileUtils.copyFile(src2,dest2);

        Thread.sleep(4000);
        driver.close();
        driver2.close();
    }
}
