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
                .setUserSubjects(subjectFakeValue)
                .setHobbies(hobbyFakeValue)
                .setUserPicture("flag.jpg")
                .setUserAddress(addressFakeValue)
                .clickOnState()
                .selectUserState(stateFakeValue)
                .clickOnCity()
                .selectUserCity(cityFakeValue)
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
                .checkResult(subjectFakeValue)
                .checkResult(hobbyFakeValue)
                .checkResult("flag.jpg")
                .checkResult(stateFakeValue+ " " +cityFakeValue);
    }

}
