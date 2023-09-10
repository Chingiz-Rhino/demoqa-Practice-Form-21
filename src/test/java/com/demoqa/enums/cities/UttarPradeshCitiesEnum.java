package com.demoqa.enums.cities;

import com.demoqa.enums.StatesEnum;

public enum UttarPradeshCitiesEnum {
    AGRA("Agra", StatesEnum.UTTAR_PRADESH),
    LUCKNOE("Lucknow", StatesEnum.UTTAR_PRADESH),
    MERRUT("Merrut",StatesEnum.UTTAR_PRADESH);

    private String cities;
    private StatesEnum statesEnum;

    UttarPradeshCitiesEnum(String cities, StatesEnum statesEnum) {
        this.cities = cities;
        this.statesEnum = statesEnum;
    }

    public String getCities() {
        return cities;
    }
}
