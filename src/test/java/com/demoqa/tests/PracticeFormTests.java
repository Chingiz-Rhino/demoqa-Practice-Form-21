package com.demoqa.tests;


import com.demoqa.pages.RegistrationPage;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.logevents.SelenideLogger.step;


public class PracticeFormTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Tag("PracticeForm")
    @DisplayName("Testing Practice Form with hardcode")
    @Test
    void fillFormTest() {
        step("Open and fill the form", ()->{
            registrationPage
                    .openWebSite()
                    .removeBanner()
                    .setFirstName("Chingiz")
                    .setLastName("Askarov")
                    .setUserEmail("chingiz-askarov@list.ru")
                    .setGender("Male")
                    .setUserPhoneNumber("9650490205")
                    .setBirthDate("20", "November", "1995")
                    .setUserSubjects("Computer Science")
                    .setHobbies("Sports")
                    .setUserPicture("flag.jpg")
                    .setUserAddress("Haryana Karnal")
                    .clickOnState()
                    .selectUserState("Haryana")
                    .clickOnCity()
                    .selectUserCity("Karnal")
                    .clickOnSubmit();
        });
        step("Verify results", ()->{
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
        });

    }

}
