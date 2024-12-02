package test;

import org.junit.jupiter.api.Test;


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
        registrationPage.selectSubject("Maths");
        registrationPage.selectHobby("Sports");
        registrationPage.fileUpload("ScreenShot_20240918130156.jpeg");
        registrationPage.setAddress("address");
        registrationPage.selectState("NCR");
        registrationPage.selectCity("Delhi");
        registrationPage.clickSubmitButton();
        registrationPage.modalDialogShouldAppear();
        registrationPage.modalDialogShouldHaveText("vasa", "ivanov", "ivanov@mail.ru",
                "2912345678", "Male", "address", "Maths", "Sports");

    }
}
