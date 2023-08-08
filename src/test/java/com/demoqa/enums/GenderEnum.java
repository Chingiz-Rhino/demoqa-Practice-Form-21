package com.demoqa.enums;

public enum GenderEnum {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    private String genders;

    GenderEnum(String genders) {
        this.genders = genders;
    }

    public String getGenders() {
        return genders;
    }
}
