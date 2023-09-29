package com.rebolledonaharro._PractRest;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BotellaController {
    private final BotellaRepo repo;

    @GetMapping("/botellas/")
    public ResponseEntity<List<Botella>> findAll(){

        List<Botella> botellas = repo.findAll();

        if(botellas.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(botellas);

    }

    @GetMapping("/botellas/{id}")
    public ResponseEntity<?> findByid(@PathVariable Long id){

        return ResponseEntity.of(repo.findById(id));

    }

    @PostMapping("/botellas/")
    public ResponseEntity<Botella> addB (@RequestBody Botella botella){
         repo.save(botella);
        return ResponseEntity.status(201).body(botella);
    }

    @PutMapping ("/botellas/{id}")
    public ResponseEntity<Botella> editB (@RequestBody Botella botella, @PathVariable Long id){

        return ResponseEntity.of(
                repo.findById(id).map(
                        old->{
                            old.setId(botella.getId());
                            old.setMaterial(botella.getMaterial());
                            old.setNombre(botella.getNombre());
                            old.setVolumen(botella.getVolumen());
                            return repo.save(old);
                        }));
    }

    @DeleteMapping("/botellas/{id}")
    public ResponseEntity<Botella> delete(@PathVariable Long id){

        if(repo.existsById(id))
            repo.deleteById(id);

        return ResponseEntity.noContent().build();

    }


}
