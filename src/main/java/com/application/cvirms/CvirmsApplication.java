package com.application.cvirms;

import com.application.cvirms.config.AppConfig;
import com.application.cvirms.config.SpringFoxConfig;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2

@Import({AppConfig.class, SpringFoxConfig.class})
//@ComponentScan(basePackages = {"com.application.cvirms.repo","com.application.cvirms.dto","com.application.cvirms.controller"})
@ComponentScan(basePackages = "com.application.cvirms.*")
public class CvirmsApplication {

	private static ConfigurableApplicationContext context;

	public static void main(String[] args) {
		context = SpringApplication.run(CvirmsApplication.class, args);
	}





	public static void stop() {
		context.close();

	}

}
