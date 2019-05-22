package org.haoloy.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"org.haoloy.*"})
public class LoyApplication {
	public static void main(String[] args) {
		SpringApplication.run(LoyApplication.class, args);
	}
}
