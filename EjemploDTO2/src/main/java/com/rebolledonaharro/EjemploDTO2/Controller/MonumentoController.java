package com.rebolledonaharro.EjemploDTO2.Controller;

import com.rebolledonaharro.EjemploDTO2.DTO.GETMonumentoDetailDTO;
import com.rebolledonaharro.EjemploDTO2.DTO.GetMonumentoDTO;
import com.rebolledonaharro.EjemploDTO2.DTO.GetMonumentoEnRutaDTO;
import com.rebolledonaharro.EjemploDTO2.Modal.Monumento;
import com.rebolledonaharro.EjemploDTO2.Repository.MonumentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/monumento")
@RequiredArgsConstructor
public class MonumentoController {

    private final MonumentoRepository monumentoRepository;


    @GetMapping("/")
    public ResponseEntity<List<GetMonumentoEnRutaDTO>> findAll(){

        List<Monumento> lista = monumentoRepository.findAll();

        if(lista.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(lista.stream().map(GetMonumentoEnRutaDTO::of).toList());

    }
    @GetMapping("/minInfo")
    public ResponseEntity<List<GetMonumentoDTO>> findAll2(){

        List<Monumento> lista = monumentoRepository.findAll();

        if(lista.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(lista.stream().map(GetMonumentoDTO::of).toList());

    }
    @GetMapping("/{id}")
    public ResponseEntity<GETMonumentoDetailDTO> findById(@PathVariable Long id){

        return ResponseEntity.of(monumentoRepository.findById(id).map(GETMonumentoDetailDTO::of));

    }

}
