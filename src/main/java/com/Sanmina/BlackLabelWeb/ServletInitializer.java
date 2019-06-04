package com.Sanmina.BlackLabelWeb;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan("com.Sanmina.BlackLabelWeb")
@EnableJpaRepositories("com.Sanmina.BlackLabelWeb.repository")
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BlackLabelWebApplication.class);
	}

}
