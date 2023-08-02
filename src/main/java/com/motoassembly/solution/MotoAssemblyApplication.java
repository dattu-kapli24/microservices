package com.motoassembly.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@EnableCircuitBreaker
public class MotoAssemblyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotoAssemblyApplication.class, args);
	}

}
