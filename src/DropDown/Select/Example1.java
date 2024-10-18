package DropDown.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_4bzeat7dnl_e&adgrpid=1326012680679100&hvadid=82876055443053&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=157888&hvtargid=kwd-82876733542853:loc-90&hydadcr=5619_2377285");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));

        Select s=new Select(dropDown);

        if (s.isMultiple())
            System.out.println("Multiple select");
        else
            System.out.println("Single select");

        List<WebElement> options = s.getOptions();
        for(WebElement option:options)
        {
            System.out.println(option.getText());
        }

        s.selectByIndex(9);
        Thread.sleep(3000);
        s.selectByValue("search-alias=audible");
        Thread.sleep(3000);
        s.selectByVisibleText("Beauty");
        Thread.sleep(3000);

        driver.close();
    }
}
