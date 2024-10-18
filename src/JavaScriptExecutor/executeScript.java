package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class executeScript {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.ajio.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);

        JavascriptExecutor js=(JavascriptExecutor)driver;   //TypeCasting ...
        js.executeScript("window.scrollBy(0,5000)");    //Scroll Down upto Y-cordinate 5000 (positive values for scrollDown)
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,5000)");    //Scroll Down upto Y-cordinate 5000 from Y-cordinate 5000
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,-5000)");   //Scroll Up upto Y-cordinate -5000 (negative values for scrollUp)
        Thread.sleep(3000);
        driver.close();
    }
}
