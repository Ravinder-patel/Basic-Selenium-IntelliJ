package Synchronization.ImplicitlyWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitlyWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://yonobusiness.sbi/");
       WebElement e1= driver.findElement(By.xpath("//a[text()='REGISTER']"));
       System.out.println("Clicked on "+e1.getText());
        e1.click();
        WebElement e2=driver.findElement(By.xpath("//a[text()='Check Status']"));
        System.out.println("Clicked on "+e2.getText());
        e2.click();

        driver.close();
    }
}
