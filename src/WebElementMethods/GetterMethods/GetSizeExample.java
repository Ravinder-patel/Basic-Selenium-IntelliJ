package WebElementMethods.GetterMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.concurrent.TimeUnit;

public class GetSizeExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://cornhub.website/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement CommunityButton = driver.findElement(By.xpath("//a[text()='Cornstars']"));
        Dimension dimension = CommunityButton.getSize();
        System.out.println(dimension);
        System.out.println("X cordinates: " + dimension.getHeight());
        System.out.println("Y cordinates: " + dimension.getWidth());
        Thread.sleep(3000);
        driver.close();
    }

}
