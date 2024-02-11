package com.application.cvirms;

import com.application.cvirms.config.AppConfig;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import({AppConfig.class})
@ComponentScan(basePackages = "com.application.cvirms.*")
public class CvirmsApplication {

	private static ConfigurableApplicationContext context;

	public static void main(String[] args) {
		context = SpringApplication.run(CvirmsApplication.class, args);
	}







}
