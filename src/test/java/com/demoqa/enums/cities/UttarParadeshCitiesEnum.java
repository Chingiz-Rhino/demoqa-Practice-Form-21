package com.demoqa.enums.cities;

import com.demoqa.enums.StatesEnum;

public enum UttarParadeshCitiesEnum {
    AGRA("Agra", StatesEnum.UTTAR_PRADESH),
    LUCKNOE("Lucknow", StatesEnum.UTTAR_PRADESH),
    MERRUT("Merrut",StatesEnum.UTTAR_PRADESH);

    private String cities;
    private StatesEnum statesEnum;

    UttarParadeshCitiesEnum(String cities, StatesEnum statesEnum) {
        this.cities = cities;
        this.statesEnum = statesEnum;
    }

    public String getCities() {
        return cities;
    }
}
