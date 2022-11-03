package com.example.BondarHW5.extraClasses;

import org.springframework.stereotype.Component;

@Component
public class User {

    private String name;
    private NameUser nameUser;
    private UserData userData;

    public User(String name, UserData userData) {
        this.name = name;
        this.userData = userData;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NameUser getNameUser() {
        return nameUser;
    }

    public void setNameUser(NameUser nameUser) {
        this.nameUser = nameUser;
    }

    public UserData getExtraUserData() {
        return userData;
    }

    public void setExtraUserData(UserData userData) {
        this.userData = userData;
    }
}
