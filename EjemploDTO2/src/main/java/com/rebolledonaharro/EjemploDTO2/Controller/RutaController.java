package com.rebolledonaharro.EjemploDTO2.Controller;

import com.rebolledonaharro.EjemploDTO2.Modal.Monumento;
import com.rebolledonaharro.EjemploDTO2.Repository.MonumentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ruta")
@RequiredArgsConstructor
public class RutaController {


    private final MonumentoRepository monumentoRepository;

    @GetMapping("/")
    public ResponseEntity<List<Monumento>> findAll(){

        List<Monumento> lista = monumentoRepository.findAll();

        if(lista.isEmpty())
            return ResponseEntity.notFound().build();

        return null;

    }



}
