package com.cars.cars_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cars.cars_api.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
