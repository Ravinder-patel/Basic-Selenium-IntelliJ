package Locators.Xpaths;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class LastFunction {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\ravin\\OneDrive\\Desktop\\Softwares\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.bollymoviereviewz.com/2013/04/bollywood-box-office-collection-2013.html");
        Thread.sleep(3000);
        WebElement last=driver.findElement(By.xpath("(//table[3]/tbody/tr[last()])"));
        System.out.println(last.getText());
        Thread.sleep(3000);
        driver.close();
    }
}
