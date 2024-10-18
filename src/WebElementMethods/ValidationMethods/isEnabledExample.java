package WebElementMethods.ValidationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.concurrent.TimeUnit;

public class isEnabledExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.instagram.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement logInButton=driver.findElement(By.cssSelector("button[type='submit']"));

        System.out.println("Before entering the credinetials");
        if(logInButton.isEnabled()){
            logInButton.click();
            System.out.println("Button is enabled");
        }
        else
            System.out.println("Button is disabled");

        driver.findElement(By.name("username")).sendKeys("euwrawuegrfjh");
        driver.findElement(By.name("password")).sendKeys("4258461");

        System.out.println("After entering the credinetials");
        if(logInButton.isEnabled()){
            logInButton.click();
            System.out.println("Button is enabled");
        }
        else
            System.out.println("Button is disabled");

        Thread.sleep(3000);
        driver.close();
    }
}
