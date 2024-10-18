package DropDown.Deselect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoapp.skillrary.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement dropDown = driver.findElement(By.id("cars"));

        Select s = new Select(dropDown);
        s.selectByIndex(0);
        Thread.sleep(3000);
        s.selectByValue("299");
        Thread.sleep(3000);
        s.selectByVisibleText("INR 100 - INR 199 ( 16 )");

        if (s.isMultiple()){
            System.out.println("Muliple select");
        System.out.println("First selected option: " + s.getFirstSelectedOption().getText());
        List<WebElement> selectedOptions = s.getAllSelectedOptions();
        System.out.println("All Selected options: ");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
        Thread.sleep(3000);
        s.deselectByIndex(0);
        Thread.sleep(3000);
        s.deselectByValue("299");
        Thread.sleep(3000);
        s.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
        Thread.sleep(3000);
    }
        else {
            System.out.println("Single select");
        }

        Thread.sleep(3000);
        driver.close();
    }
}
