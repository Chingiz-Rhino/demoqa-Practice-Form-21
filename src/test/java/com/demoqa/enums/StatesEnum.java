package com.demoqa.enums;

public enum StatesEnum {
    NCR("NCR"),
    UTTAR_PRADESH("Uttar Pradesh"),
    HARYANA("Haryana"),
    RAJASTHAN("Rajasthan");

    private String states;

    StatesEnum(String name) {
        this.states = name;
    }

    public String getStates() {
        return states;
    }

}
