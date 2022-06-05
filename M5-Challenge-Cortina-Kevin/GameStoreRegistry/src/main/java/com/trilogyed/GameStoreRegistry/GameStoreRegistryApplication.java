package com.trilogyed.GameStoreRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GameStoreRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameStoreRegistryApplication.class, args);
	}

}