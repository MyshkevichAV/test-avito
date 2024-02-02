package myshkevich;

import by.academy.myshkevich.page.AvitoPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AvitoTest extends BaseTest {

    @Test
    public void testLoginCheckPhonePost() throws InterruptedException {
        AvitoPage avitoPage = new AvitoPage();
        avitoPage.openHomePage();
        avitoPage.clickButtonEnterRegistration();
        avitoPage.sendKeysInputPhonePost();
        avitoPage.clickInputPassword();
        avitoPage.sendKeysInputPassword();
        avitoPage.clickButtonEnter();
        avitoPage.getTextMessageError();
        Assertions.assertEquals("Почта не привязана к профилю. Проверьте, нет ли опечаток, или войдите по телефону", avitoPage.getTextMessageError());
    }

    @Test
    public void testLoginCheckPassword() throws InterruptedException {
        AvitoPage avitoPage = new AvitoPage();
        avitoPage.openHomePage();
        avitoPage.clickButtonEnterRegistration();
        avitoPage.sendKeysInputPassword();
        avitoPage.clickInputPassword();
        avitoPage.sendKeysInputPassword();
        avitoPage.clickButtonEnter();
        avitoPage.getTextMessageError();
        Assertions.assertEquals("Заполните поле", avitoPage.getTextMessageError());
    }

    @Test
    public void testLoginCheckWithoutPhonePost() throws InterruptedException {
        AvitoPage avitoPage = new AvitoPage();
        avitoPage.openHomePage();
        avitoPage.clickButtonEnterRegistration();
        avitoPage.clickInputPassword();
        avitoPage.sendKeysInputPassword();
        avitoPage.clickButtonEnter();
        avitoPage.getTextMessageErrorPhonePost();
        Assertions.assertEquals("Заполните поле", avitoPage.getTextMessageErrorPhonePost());
    }

    @Test
    public void testLoginCheckWithoutPassword() throws InterruptedException {
        AvitoPage avitoPage = new AvitoPage();
        avitoPage.openHomePage();
        avitoPage.clickButtonEnterRegistration();
        avitoPage.sendKeysInputPhonePost();
        avitoPage.clickButtonEnter();
        avitoPage.getTextMessageErrorPassword();
        Assertions.assertEquals("Заполните поле", avitoPage.getTextMessageErrorPassword());
    }

    @Test
    public void testLoginCheckWithoutPhonePostPassword() throws InterruptedException {
        AvitoPage avitoPage = new AvitoPage();
        avitoPage.openHomePage();
        avitoPage.clickButtonEnterRegistration();
        avitoPage.clickButtonEnter();
        avitoPage.getTextMessageErrorPassword();
        Assertions.assertEquals("Заполните поле", avitoPage.getTextMessageErrorPassword());
    }

    @Test
    public void testSearchStringPage() throws InterruptedException {
        AvitoPage avitoPage = new AvitoPage();
        avitoPage.openHomePage();
        avitoPage.clickSendKeysFieldSearchCarLocator();
        Assertions.assertEquals("Купить Geely", avitoPage.getTextResultTitle());
    }
}
