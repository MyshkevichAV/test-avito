package myshkevich.data;

import com.github.javafaker.Faker;

public class UserData {
    private static Faker faker = new Faker();

    public static String getRandomDataIncorrectEmail() {
        return faker.internet().password() + "@test.com";
    }

    public static String getRandomCorrectEmail() {
        return faker.name().firstName() + "@" + faker.internet().safeEmailAddress();
    }

    public static String getRandomPassword() {
        return faker.internet().password();
    }

    public static String getRandomPhoneNumber() {
        StringBuilder phoneNumber = new StringBuilder();
        phoneNumber.append("29");

        for (int i = 0; i < 7; i++) {
            phoneNumber.append(faker.number().randomDigit());
        }
        return phoneNumber.toString();
    }
}
