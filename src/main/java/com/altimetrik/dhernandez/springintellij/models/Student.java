package com.altimetrik.dhernandez.springintellij.models;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countries;

    public Student() {
        this.countries = new LinkedHashMap<>();
        countries.put("United States", "US");
        countries.put("Canada", "CA");
        countries.put("Mexico", "MX");
        countries.put("France", "FR");
        countries.put("Spain", "SP");
        countries.put("Brazil", "BR");
        countries.put("Argentina", "AR");
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountries() {
        return countries;
    }
}
