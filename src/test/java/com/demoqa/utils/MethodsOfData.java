package com.demoqa.utils;

import com.demoqa.enums.*;
import com.demoqa.enums.cities.HaryanaCitiesEnum;
import com.demoqa.enums.cities.NCRCitiesEnum;
import com.demoqa.enums.cities.RajasthanCitiesEnum;
import com.demoqa.enums.cities.UttarParadeshCitiesEnum;
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

    public static String getRanFirstName() {
        return faker.name().firstName();
    }

    public static String getRanLastName() {
        return faker.name().lastName();
    }

    public static String getRanEmail() {
        return faker.internet().emailAddress();
    }

    public static String getRanGender() {
        return getRandomEnum(GenderEnum.class).getGenders();
    }

    public static String getRanPhoneNumber() {
        return faker.numerify("##########");
    }

    public static String getRanDayOfBirth() {
        int day = getRandomInt(1, 29);
        if (day < 10) {
            return "0" + Integer.toString(day);
        } else {
            return Integer.toString(day);
        }
    }

    public static String getRanMonthOfBirth() {
        return getRandomEnum(MonthEnum.class).getAllMonth();
    }

    public static String getRanYearOfBirth() {
        return Integer.toString(getRandomInt(1920, 2005));
    }

    public static String getRanSubject() {
        return getRandomEnum(SubjectsEnum.class).getSubjects();
    }

    public static String getRanHobby() {
        return getRandomEnum(HobbiesEnum.class).getAllHobbies();
    }

    public static String getRanAddress() {
        return faker.address().fullAddress();
    }

    public static String getRanState() {
        return getRandomEnum(StatesEnum.class).getStates();
    }

    public static String getRanCity(String state) {
        if (state.equals("Haryana")) {
            return getRandomEnum(HaryanaCitiesEnum.class).getCities();
        } else if (state.equals("NCR")) {
            return getRandomEnum(NCRCitiesEnum.class).getCities();
        } else if (state.equals("Rajasthan")) {
            return getRandomEnum(RajasthanCitiesEnum.class).getCities();
        } else if (state.equals("Uttar Paradesh")) {
            return getRandomEnum(UttarParadeshCitiesEnum.class).getCities();
        }
        return null;
    }

}


