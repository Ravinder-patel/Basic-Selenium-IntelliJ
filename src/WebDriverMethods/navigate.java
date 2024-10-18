package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
    /**
     * Navigate To App And Refresh
     * navigate() is useful when you need to interact with the browser history, such as going back or forward between pages.
     */
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

        WebDriver driver1 = new ChromeDriver();
        //driver1.get("https://www.linkedin.com/in/ravinder-purella-27b173203/?originalSubdomain=in");

        driver1.navigate().to("https://www.linkedin.com/in/ravinder-purella-27b173203/?originalSubdomain=in");

        Thread.sleep(5000);
        driver1.navigate().refresh();
        Thread.sleep(5000);

        driver1.quit();
    }

}
