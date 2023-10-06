package com.rebolledonaharro.EjemploDTO2.Modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Monumento {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre, codigoPais, localizacion, localidad, descripcion, urbanizacion;

    @ElementCollection
    private List<String> imagenes;

    @ManyToOne
    private Categoria categoria;

    @ManyToOne
    private Ruta ruta;

}
