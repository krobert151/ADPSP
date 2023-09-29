package com.rebolledonaharro._PractRest;
// Si, era lo que tenia en frente


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Botella {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private String material;

    private double volumen;


}
