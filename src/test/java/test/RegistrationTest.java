package test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationTest extends BaseTest{

    @Test
    void successfulRegistrationTest (){

        registrationPage.openRegistrationForm();
        registrationPage.setFirstName("vasa");
        registrationPage.setSecondName("ivanov");
        registrationPage.setEmail("ivanov@mail.ru");
        registrationPage.selectGender("Male");
        registrationPage.setPhoneNumber("2912345678");
        registrationPage.setBirthDay("July", "1975", "7" );

        $("#subjectsInput").setValue("Math").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("img/1.png");
        $("#currentAddress").setValue("vitebsk");

        registrationPage.
    }
}
