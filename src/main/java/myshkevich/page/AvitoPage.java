package myshkevich.page;

import myshkevich.data.RandomData;
import myshkevich.data.UserData;
import myshkevich.driver.SingletonDriver;
import myshkevich.resources.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class AvitoPage {
    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(SingletonDriver.getDriver(), Duration.ofSeconds(10));

    public AvitoPage() throws InterruptedException {
        this.driver = SingletonDriver.getDriver();
    }

    public void openHomePage() {
        driver.get("https://www.avito.ru/");
        Wait.waitFor(5);
    }

    public void clickButtonEnterRegistration() {
        driver.findElement(By.xpath(AvitoPageLocator.buttonEnterRegistrationLocator)).click();
        Wait.waitFor(4);
    }

    public void sendKeysInputPhonePost() {
        driver.findElement(By.xpath(AvitoPageLocator.inputPhonePostLocator)).sendKeys(UserData.getRandomDataIncorrectEmail());
        Wait.waitFor(4);
    }

    public void clickInputPassword() {
        driver.findElement(By.xpath(AvitoPageLocator.inputPasswordLocator)).click();
        Wait.waitFor(4);
    }

    public void sendKeysInputPassword() {
        driver.findElement(By.xpath(AvitoPageLocator.inputPasswordLocator)).sendKeys(RandomData.getComplexRandomDataPassword());
        Wait.waitFor(4);
    }

    public void clickButtonEnter() {
        driver.findElement(By.xpath(AvitoPageLocator.buttonEnterLocator)).click();
        Wait.waitFor(4);
    }

    public String getTextMessageError() {
        return driver.findElement(By.xpath(AvitoPageLocator.textMessageErrorLocator)).getText();
    }

    public String getTextMessageErrorPhonePost() {
        return driver.findElement(By.xpath(AvitoPageLocator.textMessageErrorPhonePostLocator)).getText();
    }

    public String getTextMessageErrorPassword() {
        return driver.findElement(By.xpath(AvitoPageLocator.textMessageErrorPasswordLocator)).getText();
    }

    public void clickSendKeysFieldSearchCarLocator() {
        driver.findElement(By.xpath(AvitoPageLocator.fieldSearchCarLocator)).click();
        driver.findElement(By.xpath(AvitoPageLocator.fieldSearchCarLocator)).sendKeys("Geely" + Keys.ENTER);
    }

    public String getTextResultTitle() {
        return driver.findElement(By.xpath(AvitoPageLocator.textBuyGeelyLocator)).getText();
    }
}
