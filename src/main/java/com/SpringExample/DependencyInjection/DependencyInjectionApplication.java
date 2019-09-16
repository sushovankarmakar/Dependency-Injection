package com.SpringExample.DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(DependencyInjectionApplication.class, args);
		Alien alien = context.getBean(Alien.class);
		alien.show();
		//alien.show();

		/*Alien alien1 = context.getBean(Alien.class);
		alien1.show();*/
	}
}
