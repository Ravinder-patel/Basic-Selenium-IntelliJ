package WebElementMethods.GetterMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class GetLocationExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://cornhub.website/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement CommunityButton = driver.findElement(By.xpath("//a[text()='Cornstars']"));
        Point location = CommunityButton.getLocation();
        System.out.println(location);
        System.out.println("X cordinates: "+location.getX());
        System.out.println("Y cordinates: "+location.getY());
        Thread.sleep(3000);
        driver.close();
    }
}
