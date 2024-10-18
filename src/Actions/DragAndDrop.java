package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement Block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
        WebElement Block3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
//        WebElement Block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
//        WebElement Block2 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
       Actions action = new Actions(driver);
//        //Thread.sleep(3000);
//        action.dragAndDrop(Block4,Block3).perform();
//       // Thread.sleep(3000);
//        action.dragAndDrop(Block2,Block3).perform();
//        //Thread.sleep(3000);
//        action.dragAndDrop(Block1,Block3).perform();
        action.clickAndHold(Block3)
                .moveToElement(Block1)
                .release()
                .build()
                .perform();

       Thread.sleep(3000);
       driver.close();
    }

}
