package com.rebolledonaharro._PracExRest;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dinosaurio {

    @Id
    @GeneratedValue
    private int id;

    private String nombre;

    private Long tamanio;

    private Long peso;

    private String dieta;

    private String era;


}
