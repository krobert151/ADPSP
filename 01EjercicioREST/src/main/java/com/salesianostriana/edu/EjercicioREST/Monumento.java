package com.salesianostriana.edu.EjercicioREST;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
public class Monumento {

    private int id;

    private String codigoPais;

    private String nombrePais;

    private String nombreCiudad;

    private Long latitud;

    private Long longuitud;

    private String nombreMonumento;

    private String descripcion;

    private String urlFoto;



}
