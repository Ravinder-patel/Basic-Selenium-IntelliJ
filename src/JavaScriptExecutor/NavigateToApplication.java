package JavaScriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateToApplication {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js=(JavascriptExecutor)driver;

        //navigate to an application
        js.executeScript("window.location=arguments[0]","https://github.com/");

        //Fetch title
        Object title=js.executeScript("return document.title");
        System.out.println(title);

        //Fetch URL
        Object url = js.executeScript("return document.URL");
        System.out.println(url);
        Thread.sleep(2000);

        //Refresh the page
        Object refresh = js.executeScript("history.go(0)");
        System.out.println(refresh);
        Thread.sleep(2000);

        driver.close();

    }
}
