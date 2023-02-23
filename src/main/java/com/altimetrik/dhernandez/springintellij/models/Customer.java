package com.altimetrik.dhernandez.springintellij.models;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {
    @NotNull(message = "First name is required")
    @Size(min = 1, message = "Please fill your fist name with a least one character")
    private String firstName;
    @NotNull(message = "Last name is required")
    @Size(min = 1, message = "Please fill your last name with a least one character")
    private String lastName;

    @Min(value = 0, message = "Please, fill with a least a value of zero (0)")
    @Max(value = 10, message = "You exceeded the amount of free passes. The maximum amount is ten (10)")
    private int freePasses;

    public Customer() {
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

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }
}
