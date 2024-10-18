package WebElementMethods.GetterMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class GetCssValueExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement createnewaccount =driver.findElement(By.xpath("//a[text()='Create new account']"));
        System.out.println(createnewaccount.getCssValue("color"));
        System.out.println(createnewaccount.getCssValue("font"));
        System.out.println(createnewaccount.getCssValue("background-color"));
        driver.close();

    }
}
