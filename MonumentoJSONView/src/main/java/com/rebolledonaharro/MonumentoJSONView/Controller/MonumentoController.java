package com.rebolledonaharro.MonumentoJSONView.Controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.rebolledonaharro.MonumentoJSONView.Modal.Monumento;
import com.rebolledonaharro.MonumentoJSONView.Repository.MonumentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.rebolledonaharro.MonumentoJSONView.Modal.MonumentoView.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/monumento")
public class MonumentoController {

    private final MonumentoRepository monumentoRepository;

    @GetMapping("/")
    @JsonView(MonumentList.class)
    public ResponseEntity<List<Monumento>> findAlll(){

        List<Monumento> lista = monumentoRepository.findAll();

        if(lista.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return ResponseEntity.ok(lista);


    }

    @GetMapping("/{id}")
    @JsonView(MonumentList.class)
    public ResponseEntity<Monumento> findbyId(@PathVariable Long id){

        return ResponseEntity.of(monumentoRepository.findById(id));

    }

    @GetMapping("/detail")
    @JsonView(MonumentoDetail.class)
    public ResponseEntity<List<Monumento>> findAlllDetail(){

        List<Monumento> lista = monumentoRepository.findAll();

        if(lista.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return ResponseEntity.ok(lista);


    }

    @GetMapping("/detail/{id}")
    @JsonView(MonumentoDetail.class)
    public ResponseEntity<Monumento> findbyIdDetail(@PathVariable Long id){

        return ResponseEntity.of(monumentoRepository.findById(id));

    }

    @GetMapping("/rutas")
    @JsonView(MonumentoEnRuta.class)
    public ResponseEntity<List<Monumento>> findAlllRutas(){

        List<Monumento> lista = monumentoRepository.findAll();

        if(lista.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return ResponseEntity.ok(lista);


    }

    @GetMapping("/rutas/{id}")
    @JsonView(MonumentoEnRuta.class)
    public ResponseEntity<Monumento> findbyIdRutas(@PathVariable Long id){

        return ResponseEntity.of(monumentoRepository.findById(id));

    }


}
