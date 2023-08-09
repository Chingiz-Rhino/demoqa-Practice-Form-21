package com.demoqa.enums.cities;

import com.demoqa.enums.StatesEnum;

public enum RajasthanCitiesEnum {
    JAIPUR("Jaipur", StatesEnum.RAJASTHAN),
    JAISELMER("Jaiselmer", StatesEnum.RAJASTHAN);

    private String cities;
    private StatesEnum statesEnum;

    RajasthanCitiesEnum(String cities, StatesEnum statesEnum) {
        this.cities = cities;
        this.statesEnum = statesEnum;
    }

    public String getCities() {
        return cities;
    }
}
