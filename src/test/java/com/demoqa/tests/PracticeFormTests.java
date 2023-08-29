package com.demoqa.tests;


import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class PracticeFormTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Tag("PracticeForm")
    @DisplayName("Testing Practice Form with hardcode")
    @Test
    void fillFormTest() {
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
