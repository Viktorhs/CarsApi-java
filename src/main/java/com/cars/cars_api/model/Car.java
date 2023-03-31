package com.cars.cars_api.model;

import java.util.Date;

import com.cars.cars_api.dto.CarDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Car {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 100, nullable = false)
  private String modelo;

  @Column(length = 100, nullable = false)
  private String fabricante;

  @Column(length = 100, nullable = false)
  private Date dataFabricacao;

  @Column(length = 100, nullable = false)
  private Integer valor;

  @Column(length = 100, nullable = false)
  private Integer anoModelo;

  public Car(CarDTO data) {
    this.modelo = data.modelo();
    this.fabricante = data.fabricante();
    this.dataFabricacao = data.dataFabricacao();
    this.valor = data.valor();
    this.anoModelo = data.anoModelo();
  }

}
