package com.cars.cars_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cars.cars_api.controller.CarsController;

@SpringBootApplication
public class CarsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsApiApplication.class, args);
	}

}
