package com.demoqa.enums.cities;

import com.demoqa.enums.StatesEnum;

public enum NCRCitiesEnum {
    DELHI("Delhi", StatesEnum.NCR),
    GURGAON("Gurgaon", StatesEnum.NCR),
    NOIDA("Noida", StatesEnum.NCR);

    private String cities;
    private StatesEnum statesEnum;

    NCRCitiesEnum(String cities, StatesEnum statesEnum) {
        this.cities = cities;
        this.statesEnum = statesEnum;
    }

    public String getCities() {
        return cities;
    }
}
