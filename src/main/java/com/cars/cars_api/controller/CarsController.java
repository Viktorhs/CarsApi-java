package com.cars.cars_api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.cars_api.dto.CarDTO;

@RestController
@RequestMapping("/api/car")

public class CarsController {

  @PostMapping
  public void create(@RequestBody CarDTO req) {

    System.out.println("Modelo: " + req.modelo());
    System.out.println("Fabricante: " + req.fabricante());
    System.out.println("Data da fabricação: " + req.dataFabricacao());
    System.out.println("Ano do Modelo: " + req.anoModelo());
    System.out.println("Valor: " + req.valor());
  }
}
