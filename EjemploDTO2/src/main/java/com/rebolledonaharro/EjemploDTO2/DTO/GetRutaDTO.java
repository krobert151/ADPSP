package com.rebolledonaharro.EjemploDTO2.DTO;

import com.rebolledonaharro.EjemploDTO2.Modal.Ruta;

import java.util.List;

public record GetRutaDTO(Long id, String nombre, String dificultad, String tiempo, List<GetMonumentoDTO> monumentos) {

    public static GetRutaDTO of(Ruta ruta){

        return new GetRutaDTO(
                ruta.getId(),
                ruta.getNombre(),
                ruta.getDificultad().name(),
                Integer.toString(ruta.getTiempo()),
                ruta.getMonumento().stream()
                        .map(GetMonumentoDTO::of)
                        .toList()
        );




    }


}
