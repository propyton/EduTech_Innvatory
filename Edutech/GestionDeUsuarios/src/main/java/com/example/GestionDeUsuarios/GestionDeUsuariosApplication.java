package com.example.GestionDeUsuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GestionDeUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDeUsuariosApplication.class, args);
	}

}
