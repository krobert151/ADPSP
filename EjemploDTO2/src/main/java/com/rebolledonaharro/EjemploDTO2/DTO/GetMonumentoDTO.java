package com.rebolledonaharro.EjemploDTO2.DTO;

import com.rebolledonaharro.EjemploDTO2.Modal.Monumento;

public record GetMonumentoDTO(Long id, String nombre, String localizacion, String localidad, String imagen, String nombreCategoria) {

    public static GetMonumentoDTO of(Monumento monumento){
        return new GetMonumentoDTO(
                monumento.getId(),
                monumento.getNombre(),
                monumento.getLocalizacion(),
                monumento.getLocalidad(),
                monumento.getImagenes().isEmpty() ? "https://place-hold.it/300" : monumento.getImagenes().get(0),
                monumento.getCategoria() != null ?monumento.getNombre() : "Sin categoria"
        );
    }

}
