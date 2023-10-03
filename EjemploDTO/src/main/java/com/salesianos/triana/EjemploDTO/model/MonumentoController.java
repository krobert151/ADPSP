package com.salesianos.triana.EjemploDTO.model;

import com.salesianos.triana.EjemploDTO.DTO.GetMonumentoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MonumentoController {

    private final MonumentoRepo monRepo;

    @GetMapping("/")
    public ResponseEntity<List<GetMonumentoDTO>> todos(){

    List<Monumento> data = monRepo.findAll();

    if(data.isEmpty())
        return ResponseEntity.notFound().build();

    //Aqui hacemos la transformacion de monumento -> GetMoumentoDTO
    List<GetMonumentoDTO> result = data.stream().map(GetMonumentoDTO::of).toList();

    return ResponseEntity.ok(result);

    }

}
