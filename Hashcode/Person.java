package com.company.hashcode;

public class Person {
    private String firstName;
    private String familyName;
    private int years;

    public Person(String firstName, String familyName, int years) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.years = years;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
