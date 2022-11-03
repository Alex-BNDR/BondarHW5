package com.example.BondarHW5.extraClasses;

import org.springframework.stereotype.Component;

@Component
public class UserData {

    String gender;
    String age;

    public UserData(String adress, String tel) {
        this.gender = adress;
        this.age = tel;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
