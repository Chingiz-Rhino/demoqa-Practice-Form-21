package com.demoqa.enums;

public enum MonthEnum {


    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");



    private String allMonth;
    MonthEnum(String allMonth) {
        this.allMonth = allMonth;
    }
    public String getAllMonth() {
        return allMonth;
    }

}
