package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class RightClick {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/login.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement forgottenAccount = driver.findElement(By.partialLinkText("Forgotten"));
        Actions action = new Actions(driver);
        action.contextClick(forgottenAccount).perform();    //To perform RIGHT click on mouse

        Robot r=new Robot();    //ROBOT class Only for standalone apllications
        r.keyPress(KeyEvent.VK_RIGHT);  //it will press the RIGHT arrow key on the keyboard
        r.keyRelease(KeyEvent.VK_RIGHT);    //it will release the RIGHT arrow key on the keyboard

        r.keyPress(KeyEvent.VK_ENTER);  //it will press the ENTER key on the keyboard
        r.keyRelease(KeyEvent.VK_ENTER);    //it will release the ENTER arrow key on the keyboard

        Thread.sleep(3000);
        driver.quit();
    }
}
