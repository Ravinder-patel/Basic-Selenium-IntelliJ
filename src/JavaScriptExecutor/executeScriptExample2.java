package JavaScriptExecutor;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class executeScriptExample2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.ajio.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
        WebElement classics = driver.findElement(By.xpath("//img[contains(@src,'ClassicBrands-Z22-header')]"));

        Point loc=classics.getLocation();   // get the X,Y cordinates of classics element
        int x=loc.getX();   //store X cordinate in x
        int y= loc.getY();  //store Y cordinate in y

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy("+x+","+y+")");   // passing x,y cordinates to scrollby()
        Thread.sleep(3000);
        driver.close();
    }
}
