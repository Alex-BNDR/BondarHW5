package com.example.BondarHW5.extraClasses;

import org.springframework.stereotype.Component;

@Component
public class NameUser {

    String firstName;
    String secondName;

    public NameUser(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "NameUser{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
