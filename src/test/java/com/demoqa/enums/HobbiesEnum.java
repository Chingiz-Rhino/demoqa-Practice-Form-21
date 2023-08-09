package com.demoqa.enums;

public enum HobbiesEnum {
    SPORTS("Sports"),
    READING("Reading"),
    MUSIC("Music");


    private String allHobbies;

    public String getAllHobbies() {
        return allHobbies;
    }

    HobbiesEnum(String allHobbies) {
        this.allHobbies = allHobbies;
    }
}
