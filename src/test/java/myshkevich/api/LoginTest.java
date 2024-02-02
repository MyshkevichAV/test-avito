package myshkevich.api;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class LoginTest {
    @Test
    public void testLoginWithEmptyEmail() {

        String bodySString = "{\n" +
                "  \"login\": \"\",\n" +
                "  \"password\": \"dsgsgsg\"\n" +
                "}";
        JsonObject bodysJson = JsonParser.parseString(bodySString)
                .getAsJsonObject();
        given()
                .header("Content-Type", "application/json")
                .body(bodySString)
                .post("https://www.avito.ru/#login?authsrc=h")
                .then().log().all();
    }

    @Test
    public void testPasswordRecovery() {

        String bodySString = "{\"eid\":3231,\"version\":0,\"ref_id\":\"2cfe10c6-6f9d-4cf2-b2ec-8d642b89af46\",\"parent_ref_id\":\"257552b9-c9db-4a9d-9956-7beedb719b96\",\"tab_id\":\"8b43289b-4517-4382-aa9f-b08d06d82af8\"}";
        JsonObject bodysJson = JsonParser.parseString(bodySString)
                .getAsJsonObject();
        given()
                .header("Content-Type", "application/json; charset=utf-8")
                .body(bodySString)
                .post("https://www.avito.ru/events/add")
                .then().log().all();
    }

    @Test
    public void testPasswordRecoveryUncorrectEmail() {

        String bodySString = "{\"email\":\"test\"}";
        JsonObject bodysJson = JsonParser.parseString(bodySString)
                .getAsJsonObject();
        given()
                .header("Content-Type", "application/json")
                .body(bodySString)
                .post("https://www.avito.ru/web/2/recover/by_email")
                .then().log().all();
    }
}
