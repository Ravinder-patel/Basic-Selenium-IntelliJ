package Synchronization.ExplicitlyWait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WebDriverWaitTitleContains {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.shoppersstack.com/");

        WebDriverWait wait=new WebDriverWait(driver,30);
        boolean status=wait.until(ExpectedConditions.titleContains("ShoppersStock"));
        System.out.println(status);
        System.out.println(driver.getTitle());
        driver.close();

}
}
