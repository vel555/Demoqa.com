import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PracticeForm {

    @BeforeAll
    static void setUp(){
    Configuration.baseUrl="https://demoqa.com";
    }

    @Test
    void practiceFormTest(){

        Configuration.timeout = 60000;
        open("/automation-practice-form");
        $(".text-center").shouldBe(visible, Duration.ofSeconds(30));
        $("#firstName").setValue("vasa");
        $("#firstName").shouldHave(value("vasa"));
        $("#lastName").setValue("ivanov");
        $("#lastName").shouldHave(value("ivanov"));
        $("#userEmail").scrollTo();
        $("#userEmail").setValue("ivanov@mail.ru");
        $("#userEmail").shouldHave(value("ivanov@mail.ru"));
        $("label[for='gender-radio-1']").scrollTo();
        $("label[for='gender-radio-1']").click();
        $("#gender-radio-1").shouldBe(checked);
        $("#userNumber").scrollTo();
        $("#userNumber").setValue("2912345678");
        $("#userNumber").shouldHave(value("2912345678"));
        $("label[for='hobbies-checkbox-3']").scrollTo();
        $("label[for='hobbies-checkbox-3']").click();
        $("#hobbies-checkbox-3").shouldBe(checked);
        $("#currentAddress").scrollTo();
        $("#currentAddress").setValue("vitebsk");
        $("#currentAddress").shouldHave(value("vitebsk"));
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").scrollTo();
        $(".react-datepicker__month-select").selectOptionByValue("8");
        $(".react-datepicker__month-select").shouldHave(value("8"));
        $(".react-datepicker__year-select").scrollTo();
        $(".react-datepicker__year-select").selectOptionByValue("1975");
        $(".react-datepicker__year-select").shouldHave(value("1975"));
        $("div.react-datepicker__day.react-datepicker__day--006").click();
        $("#submit").scrollTo();
        $("#submit").click();
    }
}
