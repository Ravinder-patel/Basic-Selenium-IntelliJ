package WebElementMethods.ValidationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class IsSelectedExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(3000);
        WebElement maleRadioButton=driver.findElement(By.xpath("//input[@value='2']"));

        System.out.println("before selecting the radio button");
        if(maleRadioButton.isSelected())
            System.out.println("Selected");
        else
            System.out.println("Not selected");

        maleRadioButton.click();
        System.out.println("before selecting the radio button");
        if(maleRadioButton.isSelected())
            System.out.println("Selected");
        else
            System.out.println("Not selected");
        Thread.sleep(3000);
        driver.close();
    }

}
