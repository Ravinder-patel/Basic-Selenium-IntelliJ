package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Drive {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
//        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
        WebDriver driver=new EdgeDriver();
        driver.close();
    }
}
