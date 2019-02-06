package IevgenTest;

import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static Driver ourInstance = new Driver();

    public static Driver getInstance() {
        return ourInstance;
    }

    private Driver() {
        Driver driver = new ChromeDriver("")
    }
}
