package com.rebolledonaharro._PractRest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@Data
public class Movil {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre,modelo,marca,tags;

    private double precio;

}
