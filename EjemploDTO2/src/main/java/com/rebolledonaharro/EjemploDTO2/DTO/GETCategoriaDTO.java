package com.rebolledonaharro.EjemploDTO2.DTO;

import com.rebolledonaharro.EjemploDTO2.Modal.Categoria;

public record GETCategoriaDTO(Long id, String nombreCategoria) {

    public static GETCategoriaDTO of(Categoria categoria){
        return new GETCategoriaDTO(categoria.getId(), categoria.getNombre());
    }

}
