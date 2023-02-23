package com.altimetrik.dhernandez.springintellij.models;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {
    @NotNull(message = "First name is required")
    @Size(min = 1, message = "Please fill your fist name with a least one character")
    private String firstName;
    @NotNull(message = "Last name is required")
    @Size(min = 1, message = "Please fill your last name with a least one character")
    private String lastName;

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
}
