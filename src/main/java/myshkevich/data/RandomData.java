package by.academy.myshkevich.data;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.UUID;

public class RandomData {
    public static String getComplexRandomDataMail() {
        String lowerRegistr = "abcdefghijklmnopqrstuvwxyz";
        String upperRegistr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numberValue = "0123456789";
        return RandomStringUtils.random(1, lowerRegistr)
                + RandomStringUtils.random(1, upperRegistr)
                + RandomStringUtils.random(1, numberValue)
                + System.currentTimeMillis()
                + "@mail.com";
    }


    public static String getComplexRandomDataPassword() {
        String lowerRegistr = "abcdefghijklmnopqrstuvwxyz";
        String upperRegistr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numberValue = "0123456789";
        return RandomStringUtils.random(1, lowerRegistr)
                + RandomStringUtils.random(1, upperRegistr)
                + RandomStringUtils.random(1, numberValue)
                + UUID.randomUUID().toString();
    }

    public static String getComplexRandomDataNumber() {
        String numberCharacters = "123456789";
        return "33" + RandomStringUtils.random(7, numberCharacters);
    }
}
