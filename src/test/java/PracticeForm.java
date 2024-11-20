import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.lang.module.Configuration;
import java.time.Duration;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.module.Configuration.*;


public class PracticeForm {

    @BeforeAll
    static void setUp(){
  //  Configuration.baseUrl="https://demoqa.com";
    }

    @Test
    void practiceFormTest(){
        open("https://demoqa.com/automation-practice-form");
        $(".text-center").shouldBe(visible, Duration.ofSeconds(30));
        $("#firstName").setValue("vasa");
        $("#lastName").setValue("ivanov");
        $("#userEmail").setValue("ivanov@mail.ru");
        $("#gender-radio-1").click();
        $("#userNumber").setValue("291234567");
        $("#hobbies-checkbox-3").click();
        $("#hobbies-checkbox-3").shouldBe(checked);
        $("#currentAddress").setValue("vitebsk");
        $("#dateOfBirthInput").click();
        $("react-datepicker__month-select").click();
    }
}
