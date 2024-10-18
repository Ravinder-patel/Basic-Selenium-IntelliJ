package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.linkedin.com/in/ravinder-purella-27b173203/?originalSubdomain=in");
        String CurrentUrl = driver.getCurrentUrl();
        System.out.println(CurrentUrl);


        Thread.sleep(3000);

        driver.quit();
    }
}
