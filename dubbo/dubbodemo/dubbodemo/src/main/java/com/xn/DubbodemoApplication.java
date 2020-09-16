package com.xn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDubbo
public class DubbodemoApplication {

	public static void main(String[] args) {
//		System.setProperty("dubbo.application.logger", "slf4j");
		SpringApplication.run(DubbodemoApplication.class, args);
	}
}
