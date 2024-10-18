package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
        WebDriver driver1 = new ChromeDriver();

        driver1.get("https://www.linkedin.com/in/ravinder-purella-27b173203/?originalSubdomain=in");

        WebDriver driver2 = new EdgeDriver();
        driver2.get("https://www.instagram.com/?hl=en");

        driver1.quit();
        driver2.quit();
    }
}
