package com.rebolledonaharro.MonumentoJSONView.Modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ruta {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private int tiempo; // En minutos

    @Enumerated(EnumType.STRING)
    private Dificultad dificultad;

    @ManyToMany // En una ruta muchos monumentos
    private List<Monumento> monumento;


}
