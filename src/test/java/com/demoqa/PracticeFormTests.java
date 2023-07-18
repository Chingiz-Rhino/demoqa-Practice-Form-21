package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTests {

    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy="eager";
    }
    @Test
    void FillFormTest(){
        open("/automation-practice-form");


        $("#firstName").setValue("Askarov");
        $("#lastName").setValue("Chingiz");
       // $("#userEmail").setValue("chingiz-askarov@list.ru");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("9650490205");
        //$("#dateOfBirthInput").setValue("20 Nov 1995");
       // $("#subjectsInput").setValue("Mother Russia");
        $("#submit").click();

        $(".modal-body").shouldHave(text("Askarov"));
        $(".modal-body").shouldHave(text("Chingiz"));
        $(".modal-body").shouldHave(text("chingiz-askarov@list.ru"));
        $(".modal-body").shouldHave(text("Male"));
        $(".modal-body").shouldHave(text("9650490205"));
        $(".modal-body").shouldHave(text("20 Nov 1995"));
        $(".modal-body").shouldHave(text("Mother Russia"));
    }
}
