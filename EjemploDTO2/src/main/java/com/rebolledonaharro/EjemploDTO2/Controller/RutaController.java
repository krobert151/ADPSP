package com.rebolledonaharro.EjemploDTO2.Controller;

import com.rebolledonaharro.EjemploDTO2.DTO.EditRutaDTO;
import com.rebolledonaharro.EjemploDTO2.DTO.GetRutaDTO;
import com.rebolledonaharro.EjemploDTO2.Modal.Monumento;
import com.rebolledonaharro.EjemploDTO2.Modal.Ruta;
import com.rebolledonaharro.EjemploDTO2.Repository.MonumentoRepository;
import com.rebolledonaharro.EjemploDTO2.Repository.RutaRespository;
import com.rebolledonaharro.EjemploDTO2.Service.RutaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ruta")
@RequiredArgsConstructor
public class RutaController {


    private final MonumentoRepository monumentoRepository;
    private final RutaRespository rutaRespository;
    private final RutaService rutaService;

    @GetMapping("/")
    public ResponseEntity<List<Monumento>> findAll(){

        List<Monumento> lista = monumentoRepository.findAll();

        if(lista.isEmpty())
            return ResponseEntity.notFound().build();

        return null;

    }

    @PostMapping("/")
    public ResponseEntity<GetRutaDTO> nuevaRuta(@RequestBody EditRutaDTO nuevo){
        return ResponseEntity.status(HttpStatus.CREATED).body(GetRutaDTO.of(rutaService.save(nuevo)));

    }


}
