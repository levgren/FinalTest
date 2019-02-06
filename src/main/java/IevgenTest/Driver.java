package IevgenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static Driver ourInstance = new Driver();

    public static WebDriver driver;

    private Driver() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String url = "https://dom.ria.com/ru/search/";
        driver.get(url);
        System.out.println("Page opens!");


    }

    public static WebDriver get() {
        if(driver==null)
            new Driver();
        return driver;
    }
}
