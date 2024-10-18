package Synchronization.CustomWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CustomWaitExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//button[.='Start']")).click();

        WebElement element=null;
        int count=0;
      // while (count<20){
            try {
                Thread.sleep(10000);
                element=driver.findElement(By.xpath("//h4[.='Hello World!']"));
            }
            catch (Exception e){
                Thread.sleep(1000);
                count++;
            }
      // }
        System.out.println(element.getText());
        driver.close();
    }
}
