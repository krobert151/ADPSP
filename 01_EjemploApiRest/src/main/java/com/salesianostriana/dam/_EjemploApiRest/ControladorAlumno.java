package com.salesianostriana.dam._EjemploApiRest;

import com.salesianostriana.dam._EjemploApiRest.Alumno;
import com.salesianostriana.dam._EjemploApiRest.RepositorioAlumno;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class ControladorAlumno {

    private final RepositorioAlumno repositorioAlumno;
    
    @GetMapping("/alumno/")
    public List<Alumno> getAll(){
        return repositorioAlumno.findAll();
    }

    @GetMapping("/alumno/{id}")
    public Alumno findByid(@PathVariable int id){

        return repositorioAlumno.findById(id).orElse(null);


    }


    @PostMapping("/alumno/")
    public Alumno create(@RequestBody Alumno alumno){

        return repositorioAlumno.save(alumno);
    }

    @PutMapping("/alumno/editar/{id}")
    public Alumno edit(@PathVariable int id ,@RequestBody Alumno alumno){
        return repositorioAlumno.edit(alumno);

    }

    @DeleteMapping("/alumno/delete/{id}")
    public ResponseEntity<?> delete (@PathVariable int id){

        Optional<Alumno> a = repositorioAlumno.findById(id);
        a.ifPresent(repositorioAlumno::delete);

        return ResponseEntity.noContent().build();

    }

}
