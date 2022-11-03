package com.example.BondarHW5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.example.BondarHW5.extraClasses", "com.example.BondarHW5.configuration"})
@SpringBootApplication
public class BondarHw5Application {

	public static void main(String[] args) {

		ApplicationContext apc = SpringApplication.run(BondarHw5Application.class, args);

		for (String s : apc.getBeanDefinitionNames()) {
			System.out.println(s);
		}

		var firstBean = apc.getBean("firstUser");
		System.out.println(".........." + firstBean.toString() + "..........");

		var secondBean = apc.getBean("secondUser");
		System.out.println(".........." + secondBean.toString() + "..........");
	}

}