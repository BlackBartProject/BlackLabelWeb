package com.Sanmina.BlackLabelWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration

@ComponentScan("com.Sanmina.BlackLabelWeb")
@EnableJpaRepositories("com.Sanmina.BlackLabelWeb.repository")
public class BlackLabelWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlackLabelWebApplication.class, args);
	}

}
