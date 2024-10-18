package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwagLabs {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");


        driver.findElement(By.cssSelector("input.input_error[id=user-name]")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input.input_error[id=password]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input.submit-button[name=login-button]")).click();
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
        driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
        driver.findElement(By.xpath("//span[text()='1']")).click();
        //driver.findElement(By.xpath("")).click();

        Thread.sleep(3000);
        driver.close();


    }
}
