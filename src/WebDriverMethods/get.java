package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
/*
get() method is used to navigate the browser to a specific URL.
It loads a new web page in the current browser window or tab.
 */
        driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
        Thread.sleep(3000);

        driver.close();
    }
}
