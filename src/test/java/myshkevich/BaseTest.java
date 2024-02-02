package myshkevich;

import by.academy.myshkevich.driver.SingletonDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    @BeforeEach
    public void start() throws InterruptedException {
        WebDriver driver = SingletonDriver.getDriver();
     //   driver.get("https://www.avito.ru/");
    }

    @AfterEach
    public void baseFinish() {
        SingletonDriver.quitDriver();
    }
}
