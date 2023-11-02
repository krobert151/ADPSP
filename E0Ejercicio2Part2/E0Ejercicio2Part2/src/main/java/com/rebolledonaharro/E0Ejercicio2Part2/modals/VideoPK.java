package com.rebolledonaharro.E0Ejercicio2Part2.modals;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class VideoPK implements Serializable {

    private CursoOnline cursoOnline;
    private Long videoCode;

    private VideoPK(){};

}
