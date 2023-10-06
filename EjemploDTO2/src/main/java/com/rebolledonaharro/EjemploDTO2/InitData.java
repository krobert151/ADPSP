package com.rebolledonaharro.EjemploDTO2;

import com.rebolledonaharro.EjemploDTO2.Modal.Categoria;
import com.rebolledonaharro.EjemploDTO2.Modal.Monumento;
import com.rebolledonaharro.EjemploDTO2.Repository.CategoriaRepository;
import com.rebolledonaharro.EjemploDTO2.Repository.MonumentoRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InitData {

    private final CategoriaRepository categoriaRepository;
    private final MonumentoRepository monumentoRepository;

    public InitData() {
    }
//COPIAR DE LUISMI
    @PostConstruct
        public void init(){

                Categoria c = new Categoria(1L,"Religiosos");

                Monumento m1 = Monumento.builder()
                                .nombre("Catedral de Sevillla")
                                        .localizacion("Aqui")
                                                .localidad("Sevilla")
                                                        .descripcion("mu chullo")
                                                                .imagenes(List.of("https:img1","httpimg2"))
                                                                        .
                        build()

            }

}
