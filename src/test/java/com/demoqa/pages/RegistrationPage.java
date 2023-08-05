package com.demoqa.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    CalendarComponent calendar = new CalendarComponent();
    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genterWrapper = $("#genterWrapper"),
            userPhoneNumberInput = $("#userNumber"),
            userBirthDateInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbiesWrapper = $("#hobbiesWrapper");


    public RegistrationPage openWebSite(){
        open("/automation-practice-form");
        Selenide.executeJavaScript("$('#fixedban').remove()");
        Selenide.executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistrationPage setFirstName(String name) {
        firstNameInput.setValue(name);
        return this;
    }

    public RegistrationPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }

    public RegistrationPage setUserEmail(String userEmail) {
        userEmailInput.setValue(userEmail);
        return this;
    }

    public RegistrationPage setGender(String gender) {
        genterWrapper.$(byText(gender)).click();
        return this;
    }

    public RegistrationPage setUserPhoneNumber (String userPhone) {
        userPhoneNumberInput.setValue(userPhone);
        return this;
    }

    public RegistrationPage setBirthDate (String day, String month, String year) {
        userBirthDateInput.click();
        calendar.setDate(day, month, year);
        return this;
    }

    public RegistrationPage setUserSubjects (String userSubjects) {
        subjectsInput.setValue(userSubjects).pressEnter();
        return this;
    }

    public RegistrationPage setHobbies (String userHobbies) {
        hobbiesWrapper.$(byText(userHobbies)).click();
        return this;
    }












    public RegistrationPage checkResult(String results) {
        $(".table-responsive").shouldHave(text(results));
        return this;
    }
}
