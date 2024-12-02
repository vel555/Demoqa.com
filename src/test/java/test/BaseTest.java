package test;

import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;
import com.codeborne.selenide.Configuration;


public class BaseTest {

    RegistrationPage registrationPage= new RegistrationPage();

    @BeforeAll
    static void  setUp(){
        Configuration.baseUrl="https://demoqa.com";
        Configuration.browserSize= "1920x1080";
    }
}
