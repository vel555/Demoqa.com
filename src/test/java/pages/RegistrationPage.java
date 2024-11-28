package pages;

import pages.components.Calendar;

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
        $("#userEmail").setValue(value);
        return this;
    }

    public RegistrationPage setPhoneNumber(String value){
        $("#userNumber").setValue(value);
        return this;
    }
    public RegistrationPage selectGender(String value){
        $("#genderWrapper").$(byText(value)).click();
        return this;
    }

    public RegistrationPage setBirthDay(String month, String year, String day){
        $("#dateOfBirthInput").click();
        calendar.setBirthDay(month,year,day);
        return this;
    }
}
