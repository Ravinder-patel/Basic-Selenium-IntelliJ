package WebElementMethods.GetterMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class GetRectExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.netflix.com/in/");
        WebElement getStartedButton=driver.findElement(By.xpath("//button[text()='Get Started']"));
        Rectangle rect=getStartedButton.getRect();
        System.out.println(rect.getX()+"\t"+rect.getY());
        System.out.println(rect.getHeight()+"\t"+rect.getWidth());

        getStartedButton.submit();
        Thread.sleep(4000);
        driver.close();
    }
}
