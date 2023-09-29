package com.rebolledonaharro._PracExRest;

import com.fasterxml.jackson.databind.JsonMappingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class DinoController {

    private final DinoRepoI repo;


    @GetMapping("/dinos/")
    public ResponseEntity<List<Dinosaurio>> findAll(){

        List<Dinosaurio> dinos = repo.findAll();

        if(dinos.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(dinos);

    }

    @GetMapping("/dinos/{id}")
    public Dinosaurio findById (@PathVariable int id){

        return repo.findById(id).orElseThrow(()-> new DinoNotFoundException(id));

    }

    @PostMapping("/dinos/")
    public ResponseEntity<Dinosaurio> create (@RequestBody Dinosaurio d){
         repo.save(d);

        return ResponseEntity.status(201).body(d);

    }

    @PutMapping("/dinos/{id}")
    public ResponseEntity<Dinosaurio> edit(@RequestBody Dinosaurio d, @PathVariable int id){

        return ResponseEntity.of(
                repo.findById(id).map(
                        old -> {
                            old.setNombre(d.getNombre());
                            old.setEra(d.getEra());
                            old.setPeso(d.getPeso());
                            old.setTamanio(d.getTamanio());
                            old.setDieta(d.getDieta());
                            return repo.save(old);
                        }
                ));
    }

    @DeleteMapping("/dinos/{id}")
    public ResponseEntity<?> delete (@PathVariable int id){

        if( repo.existsById(id))
            repo.deleteById(id);

        return ResponseEntity.noContent().build();

    }

    @ExceptionHandler(DinoNotFoundException.class)
    public ResponseEntity<DinoError> handleDinoNoEncontrado(DinoNotFoundException ex){
        DinoError dinoError = new DinoError();
        dinoError.setEstado(HttpStatus.NOT_FOUND);
        dinoError.setFecha(LocalDateTime.now());
        dinoError.setMensaje(ex.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(dinoError);

    }

    @ExceptionHandler(JsonMappingException.class)
    public ResponseEntity<DinoError> handleJsonMappingException(JsonMappingException ex){
        DinoError dinoError = new DinoError();
        dinoError.setEstado(HttpStatus.BAD_REQUEST);
        dinoError.setFecha(LocalDateTime.now());
        dinoError.setMensaje(ex.getMessage());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dinoError);
    }

}
