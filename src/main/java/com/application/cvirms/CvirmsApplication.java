package com.application.cvirms;

import com.application.cvirms.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(AppConfig.class)
//@ComponentScan(basePackages = {"com.application.cvirms.repo","com.application.cvirms.dto","com.application.cvirms.controller"})
@ComponentScan(basePackages = "com.application.cvirms.*")
public class CvirmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvirmsApplication.class, args);
	}

}
