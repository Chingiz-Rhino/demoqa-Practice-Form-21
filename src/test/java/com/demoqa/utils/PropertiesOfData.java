package com.demoqa.utils;

import com.github.javafaker.Faker;

import static com.demoqa.utils.MethodsOfData.*;

import java.util.Locale;

public class PropertiesOfData {
    static Faker faker = new Faker(Locale.ENGLISH);


    public static String
            firstNameFakeValue = getFirstName(),
            lastNameFakeValue = getLastName(),
            emailFakeValue = getEmail(),
            genderFakeValue = getGender(),
            phoneNumberFakeValue = getPhoneNumber(),
            dayOfBirthFakeValue = getDayOfBirth(),
            monthOfBirthFakeValue = getMonthOfBirth(),
            yearOfBirthFakeValue = getYearOfBirth();
}
