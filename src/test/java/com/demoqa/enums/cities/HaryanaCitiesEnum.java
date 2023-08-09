package com.demoqa.enums.cities;

import com.demoqa.enums.StatesEnum;

public enum HaryanaCitiesEnum {
    KARNAL("Karnal", StatesEnum.HARYANA),
    PANIPAT("Panipat", StatesEnum.HARYANA);

    private String cities;
    private StatesEnum statesEnum;

    public String getCities() {
        return cities;
    }

    HaryanaCitiesEnum(String cities, StatesEnum statesEnum) {
        this.cities = cities;
        this.statesEnum = statesEnum;
    }
}
