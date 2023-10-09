package com.rebolledonaharro.EjemploDTO2;

import com.rebolledonaharro.EjemploDTO2.Modal.Categoria;
import com.rebolledonaharro.EjemploDTO2.Modal.Dificultad;
import com.rebolledonaharro.EjemploDTO2.Modal.Monumento;
import com.rebolledonaharro.EjemploDTO2.Modal.Ruta;
import com.rebolledonaharro.EjemploDTO2.Repository.CategoriaRepository;
import com.rebolledonaharro.EjemploDTO2.Repository.MonumentoRepository;
import com.rebolledonaharro.EjemploDTO2.Repository.RutaRespository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@RequiredArgsConstructor
public class InitData {

    private final CategoriaRepository categoriaRepository;
    private final MonumentoRepository monumentoRepository;
    private final RutaRespository rutaRepository;

    @PostConstruct
    public void init() {

        Categoria c = new Categoria(1L, "Religiosos");
        categoriaRepository.save(c);

        Monumento m1 = Monumento.builder()
                .nombre("Catedral de Sevilla")
                .localizacion("123,123")
                .localidad("Sevilla")
                .descripcion("asñdjflaksdlfñj ñlkaf dfjkañd fklas ")
                .imagenes(List.of("http://imagen1.jpg", "http://imagen2.jpg"))
                .categoria(c)
                .codigoPais("España")
                .codigoPais("es")
                .build();

        Monumento m2 = Monumento.builder()
                .nombre("San Luis de los Franceses")
                .localizacion("123,123")
                .localidad("Sevilla")
                .descripcion("asñdjflaksdlfñj ñlkaf dfjkañd fklas ")
                .imagenes(List.of("http://imagen3.jpg", "http://imagen4.jpg"))
                .categoria(c)
                .codigoPais("España")
                .codigoPais("es")
                .build();

        monumentoRepository.saveAll(List.of(m1, m2));


        Ruta r = Ruta.builder()
                .nombre("Iglesias wenas de verdá")
                .dificultad(Dificultad.BAJA)
                .tiempo(20)
                .monumento(List.of(m1, m2))
                .build();
        rutaRepository.save(r);

    }

}