package com.app.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SwiggyAppServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwiggyAppServerApplication.class, args);
	}

}
