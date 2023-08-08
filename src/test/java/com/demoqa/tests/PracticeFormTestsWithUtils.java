package com.demoqa.tests;


import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.demoqa.utils.PropertiesOfData.*;


public class PracticeFormTestsWithUtils extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {
        registrationPage
                .openWebSite()
                .removeBanner()
                .setFirstName(firstNameFakeValue)
                .setLastName(lastNameFakeValue)
                .setUserEmail(emailFakeValue)
                .setGender(genderFakeValue)
                .setUserPhoneNumber(phoneNumberFakeValue)
                .setBirthDate(dayOfBirthFakeValue, monthOfBirthFakeValue, yearOfBirthFakeValue)
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
                .checkResult(firstNameFakeValue + " " + lastNameFakeValue)
                .checkResult(emailFakeValue)
                .checkResult(genderFakeValue)
                .checkResult(phoneNumberFakeValue)
                //"20 November,1995"
                .checkResult(dayOfBirthFakeValue + " "+monthOfBirthFakeValue + ","+ yearOfBirthFakeValue)
                .checkResult("Computer Science")
                .checkResult("Sports")
                .checkResult("flag.jpg")
                .checkResult("Haryana Karnal");
    }

}
