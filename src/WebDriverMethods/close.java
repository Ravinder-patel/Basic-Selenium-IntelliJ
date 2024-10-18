package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2"); //new browser windows
        driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");    // new tabs
        Thread.sleep(10000);
        driver.findElement(By.id("browserButton2")).click();

        Thread.sleep(3000);

        driver.close(); // close method is used to close the current browser window or tab that the WebDriver is controlling.
    }
}
