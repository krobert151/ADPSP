package com.rebolledonaharro.EjemploDTO2.Service;

import com.rebolledonaharro.EjemploDTO2.DTO.EditRutaDTO;
import com.rebolledonaharro.EjemploDTO2.Modal.Dificultad;
import com.rebolledonaharro.EjemploDTO2.Modal.Monumento;
import com.rebolledonaharro.EjemploDTO2.Modal.Ruta;
import com.rebolledonaharro.EjemploDTO2.Repository.MonumentoRepository;
import com.rebolledonaharro.EjemploDTO2.Repository.RutaRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RutaService {

    private final RutaRespository rutaRespository;
    private final MonumentoRepository monumentoRepository;

    public Ruta save (EditRutaDTO nuevo){
        Ruta r = new Ruta();
        r.setNombre(nuevo.nombre());
        r.setTiempo(nuevo.duracion());
        r.setDificultad(Dificultad.valueOf(nuevo.dificultad()));
        r.setMonumento(nuevo.monumentos().stream()
                .map(monumentoRepository::getReferenceById)
                .toList());
        return rutaRespository.save(r);

    }


}
