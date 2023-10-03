package com.salesianos.triana.EjemploDTO.DTO;

import com.salesianos.triana.EjemploDTO.model.Monumento;
import lombok.Builder;
import lombok.Value;

//buscar por quer value y no data
@Value
@Builder
public class GetMonumentoDTO {

    private Long id;
    private String nombre, localizacion,url,nombreCategoria;


    public static GetMonumentoDTO of (Monumento monumento){
        return GetMonumentoDTO.builder()
                .id(monumento.getId())
                .localizacion(monumento.getLocalizacon())
                .url(monumento.getUrl())
                //.nombreCategoria(monumento.getCategoria().getNombre())
                .nombreCategoria(
                        monumento.getCategoria() != null
                                ? monumento.getCategoria().getNombre()
                                : "Sin categoria")
                .build();
    }
}



