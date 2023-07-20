package com.demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1980x1200";
    }

    @Test
    void fillFormTest() {


        open("/automation-practice-form");

        Selenide.executeJavaScript("$('#fixedban').remove()");
        Selenide.executeJavaScript("$('footer').remove()");

        $("#firstName").setValue("Askarov");
        $("#lastName").setValue("Chingiz");
        $("#userEmail").setValue("chingiz-askarov@list.ru");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("9650490205");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").$(byText("November")).click();
        $(".react-datepicker__year-select").$(byText("1995")).click();
        $("div.react-datepicker__day--020").click();
        $("#subjectsInput").setValue("Computer Science").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#currentAddress").setValue("Haryana Karnal");
        $("#uploadPicture").uploadFromClasspath("flag.jpg");
       // $("#uploadPicture").uploadFile(new File("src/test/resources/flag.jpg"));
        $("#stateCity-wrapper").$(byText("Select State")).click();
        $("#react-select-3-option-2").click();
        $("#stateCity-wrapper").$(byText("Select City")).click();
        $("#react-select-4-option-0").click();

        $("#submit").click();

        $("tbody tr:nth-child(1) td:nth-child(2)").shouldHave(text("Askarov Chingiz"));
        $("tbody tr:nth-child(2) td:nth-child(2)").shouldHave(text("chingiz-askarov@list.ru"));
        $("tbody tr:nth-child(3) td:nth-child(2)").shouldHave(text("Male"));
        $("tbody tr:nth-child(4) td:nth-child(2)").shouldHave(text("9650490205"));
        $("tbody tr:nth-child(5) td:nth-child(2)").shouldHave(text("20 November,1995"));
        $("tbody tr:nth-child(6) td:nth-child(2)").shouldHave(text("Computer Science"));
        $("tbody tr:nth-child(7) td:nth-child(2)").shouldHave(text("Sports"));
        $("tbody tr:nth-child(8) td:nth-child(2)").shouldHave(text("flag.jpg"));
        $("tbody tr:nth-child(9) td:nth-child(2)").shouldHave(text("Haryana Karnal"));


    }

}
