package com.rebolledonaharro._PractRest;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class MovilController {

    private final MovilRepo repo;

    @GetMapping("/movil/")
    public ResponseEntity<List<Movil>> findAll(){

        List <Movil> lista = repo.findAll();

        if(lista.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(lista);

    }


    @GetMapping("/movil/{id}")
    public ResponseEntity<?> findById (@PathVariable Long id){

        return ResponseEntity.of(repo.findById(id));


    }

    @PostMapping("/movil/")
    public ResponseEntity<Movil> addMovil (@RequestBody Movil movil){

        repo.save(movil);
        return ResponseEntity.status(201).body(movil);


    }

    @PutMapping("/movil/{id}")
    public ResponseEntity<Movil> editById(@RequestBody Movil movil, @PathVariable Long id){

        return  ResponseEntity.of(repo.findById(id).map(
                old->{
                    old.setId(movil.getId());
                    old.setModelo(movil.getModelo());
                    old.setMarca(movil.getMarca());
                    old.setPrecio(movil.getPrecio());
                    old.setTags(movil.getTags());
                    return repo.save(old);
                }
        ));
    }

    @PutMapping("/movil/{id}/add/{tags}")
    public ResponseEntity<Movil> addTags(@PathVariable Long id, @PathVariable String tags){

        return ResponseEntity.of(repo.findById(id).map(
                old-> {
                    String tg = old.getTags();
                    old.setTags(tg+","+tags);
                    return repo.save(old);
                }
        ));

    }


    @DeleteMapping("/movil/{id}")
    public ResponseEntity<Movil> deleteById (@PathVariable Long id){

        if(repo.existsById(id))
            repo.deleteById(id);


        return ResponseEntity.status(204).build();


    }



}
