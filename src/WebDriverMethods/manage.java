package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage {
    /*

The manage() method in Selenium WebDriver is used to manage various settings and configurations for the WebDriver instance.
 It returns an Options interface through which you can manage browser cookies, timeouts, window sizes,
  and other browser settings.
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();    //maximize the window

        driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
        Thread.sleep(3000);

        driver.quit(); // quit method is used to lose all the browser windows and tabs opened by the WebDriver and safely ends the WebDriver session.
    }
}
