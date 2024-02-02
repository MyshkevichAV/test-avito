package myshkevich.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonDriver {
    private static WebDriver driver;

    public static WebDriver getDriver() throws InterruptedException {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(4000);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        } else
            driver.quit();
    }
}
