package com.demoqa.tests;

import com.codeborne.selenide.Selenide;
import com.demoqa.pages.CalendarComponent;
import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {
        registrationPage
                .openWebSite()
                .setFirstName("Chingiz")
                .setLastName("Askarov")
                .setUserEmail("chingiz-askarov@list.ru")
                .setGender("Male")
                .setUserPhoneNumber("9650490205")
                .setBirthDate("20","November", "1995")
                .setUserSubjects("Computer Science")
                .setHobbies("Sports")
                .setUserPicture("flag.jpg")
                .setUserAddress("Haryana Karnal")
                .clickOnState()
                .selectUserState("Haryana")
                .clickOnCity()
                .selectUserCity("Karnal")
                .clickOnSubmit();



       // $("#example-modal-sizes-title-lg").shouldHave((text("Thanks for submitting the form")));

        registrationPage
                .checkTable()
                .checkTableText()
                .checkResult("Chingiz Askarov")
                .checkResult("chingiz-askarov@list.ru")
                .checkResult("Male")
                .checkResult("9650490205")
                .checkResult("20 November,1995")
                .checkResult("Computer Science")
                .checkResult("Sports")
                .checkResult("flag.jpg")
                .checkResult("Haryana Karnal");
    }

}
