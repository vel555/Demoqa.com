package pages;

import pages.components.Calendar;
import pages.components.ModalDialog;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    Calendar calendar = new Calendar();

    public RegistrationPage openRegistrationForm(){
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove();");
        return this;
    }

    public RegistrationPage setFirstName(String value){
        $("#firstName").setValue(value);
        return this;
    }

    public RegistrationPage setSecondName(String value){
        $("#lastName").setValue(value);
        return this;
    }
    public RegistrationPage setEmail(String value){
        $("#userEmail").scrollTo().setValue(value);
        return this;
    }

    public RegistrationPage setPhoneNumber(String value){
        $("#userNumber").scrollTo().setValue(value);
        return this;
    }
    public RegistrationPage selectGender(String value){
        $("#genterWrapper").$(byText(value)).scrollTo().click();
        return this;
    }

    public RegistrationPage setBirthDay(String month, String year, String day){
        $("#dateOfBirthInput").scrollTo().click();
        calendar.setBirthDay(month,year,day);
        return this;
    }

    public void selectState(String state){
        $("#state").scrollTo().click();
        $("#stateCity-wrapper").$(byText(state)).click();
    }

    public void selectCity(String city){
        $("#city").scrollTo().click();
        $("#stateCity-wrapper").$(byText(city)).click();
    }

    public void selectSubject(String value){
        $("#subjectsInput").setValue(value).pressEnter();
    }

    public void selectHobby(String value){
        $("#hobbiesWrapper").$(byText(value)).click();
    }

    public void fileUpload(String value){
        $("#uploadPicture").uploadFromClasspath(value);
    }

    public void setAddress(String value){
        $("#currentAddress").setValue(value);
    }

    public void clickSubmitButton(){
        $("#submit").scrollTo().click();
    }

    public void modalDialogShouldAppear(){
        ModalDialog.modalDialogShouldAppearing();
    }

    public void modalDialogShouldHaveText(String name, String surname,String email,String phone,
                                          String gender,String address,String subject,String hobby){
        ModalDialog.modalDialogShouldHaveTexting(name, surname, email, phone, gender, address, subject, hobby);
    }
}
