package com.salesianostriana.edu.EjercicioREST;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Monumento {

    @Id
    @GeneratedValue
    private int id;

    private String codigoPais;

    private String nombrePais;

    private String nombreCiudad;

    private Double latitud;

    private Double longuitud;

    private String nombreMonumento;

    private String descripcion;

    private String urlFoto;



}
