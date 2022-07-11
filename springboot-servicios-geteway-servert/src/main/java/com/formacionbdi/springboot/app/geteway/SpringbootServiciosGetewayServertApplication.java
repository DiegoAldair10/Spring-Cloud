package com.formacionbdi.springboot.app.geteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringbootServiciosGetewayServertApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServiciosGetewayServertApplication.class, args);
	}

}
