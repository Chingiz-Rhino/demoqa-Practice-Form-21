package com.demoqa.utils;

import com.demoqa.enums.*;
import com.github.javafaker.Faker;

import java.util.concurrent.ThreadLocalRandom;

import static com.demoqa.utils.PropertiesOfData.faker;


public class MethodsOfData {


    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static <T extends Enum<?>> T getRandomEnum(Class<T> enumClass) {
        int index = getRandomInt(0, enumClass.getEnumConstants().length - 1);
        return enumClass.getEnumConstants()[index];
    }

    public static String getFirstName() {
        return faker.name().firstName();
    }

    public static String getLastName() {
        return faker.name().lastName();
    }

    public static String getEmail() {
        return faker.internet().emailAddress();
    }

    public static String getGender() {
        return getRandomEnum(GenderEnum.class).getGenders();
    }

    public static String getPhoneNumber() {
        return faker.numerify("##########");
    }

    public static String getDayOfBirth() {
        int day = getRandomInt(1, 29);
        if (day < 10) {
            return "0" + Integer.toString(day);
        } else {
            return Integer.toString(day);
        }
    }

    public static String getMonthOfBirth() {
        return getRandomEnum(MonthEnum.class).getAllMonth();
    }
    public static String getYearOfBirth(){
        return Integer.toString(getRandomInt(1920, 2005));
    }
    public static void main(String[] args) {
        MethodsOfData methodsOfData = new MethodsOfData();
        System.out.println(getPhoneNumber());
    }


}


