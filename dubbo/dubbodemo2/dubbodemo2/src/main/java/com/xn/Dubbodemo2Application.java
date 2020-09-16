package com.xn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ComponentScan(basePackages={"com.xn"})
public class Dubbodemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Dubbodemo2Application.class, args);
	}
}
