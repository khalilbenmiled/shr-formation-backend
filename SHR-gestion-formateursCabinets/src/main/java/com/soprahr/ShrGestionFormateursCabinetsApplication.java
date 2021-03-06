package com.soprahr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ShrGestionFormateursCabinetsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShrGestionFormateursCabinetsApplication.class, args);
	}

}
