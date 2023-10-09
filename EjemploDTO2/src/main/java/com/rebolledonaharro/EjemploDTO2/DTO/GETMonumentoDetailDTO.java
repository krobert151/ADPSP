package com.rebolledonaharro.EjemploDTO2.DTO;

import com.rebolledonaharro.EjemploDTO2.Modal.Monumento;

import java.util.List;

public record GETMonumentoDetailDTO(
        Long id,
        String nombre,
        String localizacion,
        String localidad,

        String codigoPais,

        String descripcion,
        List<String> Imagenes,
        GETCategoriaDTO categoria

        ) {

    public static GETMonumentoDetailDTO of(Monumento monumento){

        return new GETMonumentoDetailDTO(
                monumento.getId(),
                monumento.getNombre(),
                monumento.getLocalizacion(),
                monumento.getLocalidad(),
                monumento.getCodigoPais(),
                monumento.getDescripcion(),
                monumento.getImagenes(),
                (monumento.getCategoria() == null) ? null : GETCategoriaDTO.of(monumento.getCategoria()));

    }

}
