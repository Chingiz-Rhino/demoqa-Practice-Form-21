package com.demoqa.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
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
            genderWrapper = $("#genterWrapper"),
            userPhoneNumberInput = $("#userNumber"),
            userBirthDateInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            userAddressInput = $("#currentAddress"),
            pictureInput = $("#uploadPicture"),
            stateClick = $("#state"),
            selectState = $("#stateCity-wrapper"),
            cityClick = $("#city"),
            selectCity = $("#stateCity-wrapper"),
            submitClick = $("#submit");


    //Open Web Site
    public RegistrationPage openWebSite() {
        open("/automation-practice-form");

        return this;
    }
    public RegistrationPage removeBanner(){
        Selenide.executeJavaScript("$('#fixedban').remove()");
        Selenide.executeJavaScript("$('footer').remove()");

        return this;
    }

    //Test Case #1
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
        genderWrapper.$(byText(gender)).click();
        return this;
    }

    public RegistrationPage setUserPhoneNumber(String userPhone) {
        userPhoneNumberInput.setValue(userPhone);
        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        userBirthDateInput.click();
        calendar.setDate(day, month, year);
        return this;
    }

    public RegistrationPage setUserSubjects(String userSubjects) {
        subjectsInput.setValue(userSubjects).pressEnter();
        return this;
    }

    public RegistrationPage setHobbies(String userHobbies) {
        hobbiesWrapper.$(byText(userHobbies)).click();
        return this;
    }

    public RegistrationPage setUserAddress(String userAddress) {
        userAddressInput.setValue(userAddress);
        return this;
    }

    public RegistrationPage setUserPicture(String userPicture) {
        pictureInput.uploadFromClasspath(userPicture);
        return this;
    }

    public RegistrationPage clickOnState() {
        stateClick.click();
        return this;
    }

    public RegistrationPage selectUserState(String userState) {
        selectState.$(byText(userState)).click();
        return this;
    }

    public RegistrationPage clickOnCity() {
        cityClick.click();
        return this;
    }

    public RegistrationPage selectUserCity(String userCity) {
        selectCity.$(byText(userCity)).click();
        return this;
    }

    public RegistrationPage clickOnSubmit() {
        submitClick.click();
        return this;
    }

    //Result
    public RegistrationPage checkTable() {
        $(".modal-dialog").should(appear);
        return this;
    }

    public RegistrationPage checkTableText() {
        $("#example-modal-sizes-title-lg").shouldHave((text("Thanks for submitting the form")));
        return this;
    }

    public RegistrationPage checkResult(String results) {
        $(".table-responsive").shouldHave(text(results));
        return this;
    }
}
