package com.altimetrik.dhernandez.springintellij.models;


import com.altimetrik.dhernandez.springintellij.annotations.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {
    @NotNull(message = "First name is required")
    @Size(min = 1, message = "Please fill your fist name with a least one character")
    private String firstName;
    @NotNull(message = "Last name is required")
    @Size(min = 1, message = "Please fill your last name with a least one character")
    private String lastName;

    @NotNull
    @Min(value = 0)
    @Max(value = 10)
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 characters/digits")
    private String postalCode;

    @CourseCode
    private String courseCode;

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

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
