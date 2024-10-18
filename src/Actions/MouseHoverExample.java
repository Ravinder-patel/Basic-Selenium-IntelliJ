package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseHoverExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.myntra.com/?utm_source=dms_bing&utm_medium=bing_cpc&utm_campaign=Bing_Brand_Exact_Desktop&utm_source=bing&msclkid=3b275c774e7e1904a4933a6f896db472&utm_term=myntra.&utm_content=Myntra_Generic");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement women =driver.findElement(By.xpath("//a[text()='Women' and @class]"));
        Actions action=new Actions(driver);
        action.moveToElement(women).perform();


        WebElement dresses=driver.findElement(By.xpath(" //a[text()='Dresses' and @data-reactid=219]"));
        dresses.click();

        Thread.sleep(3000);
        driver.close();

    }
}
