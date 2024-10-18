package WebElementMethods.ValidationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class isDisplayedExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.swiggy.com/");
        WebElement swiggyLogo= driver.findElement(By.xpath("//*[name()='svg'][@class='_8pSp-']"));  //svg

        if(swiggyLogo.isDisplayed())
        {
            System.out.println("Logo is displayed");
        }
        else
            System.out.println("Logo is not displaying");

        driver.close();
    }


}
