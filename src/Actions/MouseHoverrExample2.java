package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class MouseHoverrExample2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");  //configuring the property
        WebDriver driver = new EdgeDriver();    // Create reference to the edgedriver object
        driver.manage().window().maximize();    //maximising the browser window

        driver.get("https://demowebshop.tricentis.com/fiction");    //navigate to shopping site
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    //wait until we finding the element
        WebElement electronics=driver.findElement(By.xpath("//div[@class='header-menu']/descendant::li[6]/a")); //finding electronics element

        Actions action=new Actions(driver); //create instance to Actions class
        action.moveToElement(electronics).perform();    //moving cursor to Electronics element
        WebElement cellPhones=driver.findElement(By.xpath("//div[@class='header-menu']/descendant::li[8]/a"));  //finding Cell phones element
        action.moveToElement(cellPhones).click().perform(); //moving cursor to cell phones element and click
        WebElement usedphone=driver.findElement(By.linkText("Used phone")); //finding used phone product
        System.out.println(usedphone.getText());    // printing the product name

        Thread.sleep(3000); //wait for 3 sec

        driver.close(); //closing the browser
    }


}
