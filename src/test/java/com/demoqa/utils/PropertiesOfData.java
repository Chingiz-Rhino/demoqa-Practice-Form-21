package com.demoqa.utils;

import com.github.javafaker.Faker;

import static com.demoqa.utils.MethodsOfData.*;

import java.util.Locale;

public class PropertiesOfData {
    static Faker faker = new Faker(Locale.ENGLISH);
    public static String
            firstNameFakeValue = getRanFirstName(),
            lastNameFakeValue = getRanLastName(),
            emailFakeValue = getRanEmail(),
            genderFakeValue = getRanGender(),
            phoneNumberFakeValue = getRanPhoneNumber(),
            dayOfBirthFakeValue = getRanDayOfBirth(),
            monthOfBirthFakeValue = getRanMonthOfBirth(),
            yearOfBirthFakeValue = getRanYearOfBirth(),
            subjectFakeValue = getRanSubject(),
            hobbyFakeValue = getRanHobby(),
            pictureFakeValue = "flag.jpg",
            addressFakeValue = getRanAddress(),
            stateFakeValue = getRanState(),
            cityFakeValue = getRanCity(stateFakeValue);
}
