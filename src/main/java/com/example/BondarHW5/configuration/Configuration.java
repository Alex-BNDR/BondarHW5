package com.example.BondarHW5.configuration;

import com.example.BondarHW5.extraClasses.UserData;
import com.example.BondarHW5.extraClasses.NameUser;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public String getName()
    {
        return "";
    }

    @Bean
    public NameUser firstUser()
    {
        return new NameUser("Alex", "Bondar");
    }

    @Bean
    public UserData secondUser()
    {
        return new UserData("male", "21");
    }
}
