package com.cars.cars_api.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.cars_api.dto.CarDTO;
import com.cars.cars_api.model.Car;
import com.cars.cars_api.repository.CarRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/car")

public class CarsController {

  @Autowired
  private CarRepository repository;

  @GetMapping
  public List<Car> listAll() {
    return repository.findAll();
  }

  @PostMapping
  public void create(@RequestBody @Valid CarDTO req) {
    repository.save(new Car(req));
  }

  @PutMapping("/{id}")
  public void update(@PathVariable Long id, @RequestBody @Valid CarDTO req) {
    repository.findById(id).map(car -> {
      car.setModelo(req.modelo());
      car.setFabricante(req.fabricante());
      car.setDataFabricacao(req.dataFabricacao());
      car.setAnoModelo(req.anoModelo());
      car.setValor(req.valor());
      return repository.save(car);
    });
  }

  @DeleteMapping("/{id}")
  public String delete(@PathVariable Long id) {
    repository.deleteById(id);
    return "Delete item by id";
  }
}
