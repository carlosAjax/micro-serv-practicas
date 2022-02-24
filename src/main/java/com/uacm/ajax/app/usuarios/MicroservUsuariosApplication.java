package com.uacm.ajax.app.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroservUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservUsuariosApplication.class, args);
	}

}
