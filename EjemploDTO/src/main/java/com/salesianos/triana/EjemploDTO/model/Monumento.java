package com.salesianos.triana.EjemploDTO.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Monumento {

    @Id
    @GeneratedValue
    private Long id;

    private String codigoPais, ciudad, localizacon, nombre, descripcion, url;


    @ManyToOne
    private  Categoria categoria;

}
