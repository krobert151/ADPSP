package com.salesianostriana.edu.EjercicioREST;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class MonumentoController {


        private final RepositoryMonumentoI repo;

        @GetMapping("/monumentos/")
        public ResponseEntity<List<Monumento>> findAll(){

            List<Monumento> lista = repo.findAll();


            if(lista.isEmpty())
                    return ResponseEntity.noContent().build();

            return ResponseEntity.ok(lista);

        }

        @GetMapping("/monumentos/{id}")
        public ResponseEntity<?> findById(@PathVariable int id){


            return ResponseEntity.of(repo.findById(id));

        }

        @PostMapping("/monumentos/")
        public ResponseEntity<Monumento> create (@RequestBody Monumento m){

            Monumento nuevo = repo.save(m);

            return ResponseEntity.status(201).body(nuevo);


        }

        @PutMapping("/monumentos/{id}")
        public ResponseEntity<Monumento> edit (@PathVariable int id, @RequestBody Monumento m){

            return ResponseEntity.of(repo.findById(id).map(
                    old -> {
                        old.setId(m.getId());
                        old.setCodigoPais(m.getCodigoPais());
                        old.setNombreCiudad(m.getNombreCiudad());
                        old.setNombrePais(m.getNombrePais());
                        old.setNombreMonumento(m.getNombreMonumento());
                        old.setLatitud(m.getLatitud());
                        old.setLonguitud(m.getLonguitud());
                        old.setUrlFoto(m.getUrlFoto());
                        old.setDescripcion(m.getDescripcion());
                        return repo.save(old);
                    }
            ));
        }

        @DeleteMapping("/monumentos/{id}")
        public ResponseEntity<?> delete(@PathVariable int id){

            if(repo.existsById(id))
                repo.deleteById(id);

            return ResponseEntity.noContent().build();

        }


}
