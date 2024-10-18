package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDropExample2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement Element4=driver.findElement(By.xpath("//span[text()='Draggable 4']"));
        WebElement Element3=driver.findElement(By.xpath("//span[text()='Draggable 3']"));
        WebElement Element2=driver.findElement(By.xpath("//span[text()='Draggable 2']"));
        WebElement Element1=driver.findElement(By.xpath("//span[text()='Draggable 1']"));
        WebElement Dropzone=driver.findElement(By.id("mydropzone"));

        Point location =Dropzone.getLocation();
        System.out.println(location);

        Actions action =new Actions(driver);
                 // Method 1----------
        action.clickAndHold(Element4)
                .moveToElement(Dropzone)
                        .release()
                                .build()
                                        .perform();
                // Method 2-----------
//        action.dragAndDropBy(Element4,530, 448).perform();
                // Method 3-----------
//        action.dragAndDrop(Element4,Dropzone).perform();
//        action.dragAndDrop(Element3,Dropzone).perform();
//        action.dragAndDrop(Element2,Dropzone).perform();
//        action.dragAndDrop(Element1,Dropzone).perform();

        Thread.sleep(3000);
        driver.quit();
    }
}
