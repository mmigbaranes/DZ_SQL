package data;

import lombok.Value;
import com.github.javafaker.Faker;
import java.util.Random;

public class DataHelper {
    public static AuthInfo getAuthInfoWithTestData(){
        return new AuthInfo("vasya", "qwerty123");
    }
    private static String generateRandomLogin(){
        return FAKER.name().username();
    }
    private static String generateRandomPassword(){
        return new FAKER.internet().password();
    }
    private static String generateRandomUser(){
        return new AuthInfo(generateRandomLogin(), generateRandomPassword());
    }
    private static String generateRandomVerificationCode(){
        return new VerificationCode(FAKER.numerify("######"));
    }
    @Value
    public static class AuthInfo{
        String login;
        String password;
    }
    @Value
    public static class VerificationCode{
        String code;
    }
}
