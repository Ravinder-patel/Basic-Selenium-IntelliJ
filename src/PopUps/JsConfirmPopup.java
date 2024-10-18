package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class JsConfirmPopup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("confirmexample")).click();

        Alert alert = driver.switchTo().alert();    //Switch contrll to the Alert Interface
        System.out.println(alert.getText());    //get text on the alert popup
        Thread.sleep(2000);
        alert.dismiss(); //click CANCEL on the popup
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("confirmexplanation")).getText());  //get the clicked result

        driver.close();
    }
}
