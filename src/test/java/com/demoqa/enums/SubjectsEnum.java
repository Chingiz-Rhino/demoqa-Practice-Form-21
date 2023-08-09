package com.demoqa.enums;

public enum SubjectsEnum {
    PHYSICS("Physics"),
    CHEMISTRY("Chemistry"),
    COMPUTER_SCIENCE("Computer Science"),
    COMMERCE("Commerce"),
    MATHS("Maths"),
    ACCOUNTING("Accounting"),
    ARTS("ARTS"),
    SOCIAL_STUDIES("Social Studies");


    private String subjects;

    public String getSubjects() {
        return subjects;
    }

    SubjectsEnum(String subjects) {
        this.subjects = subjects;
    }
}
