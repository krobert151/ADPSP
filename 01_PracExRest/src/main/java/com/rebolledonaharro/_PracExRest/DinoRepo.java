package com.rebolledonaharro._PracExRest;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
@Repository
public class DinoRepo {

    private List<Dinosaurio> dinos;

    public DinoRepo() {
        dinos = new ArrayList<>();

        dinos.add(
                Dinosaurio.builder()
                        .id(1)
                        .nombre("rex")
                        .era("Cretacico")
                        .tamanio(12L)
                        .peso(100L)
                        .dieta("Carne")
                        .build()
        );

        dinos.add(
                Dinosaurio.builder()
                        .id(2)
                        .nombre("bronto")
                        .era("Cretacico")
                        .tamanio(20L)
                        .peso(400L)
                        .dieta("Plantas")
                        .build()
        );

        dinos.add(
                Dinosaurio.builder()
                        .id(3)
                        .nombre("Torosaurus")
                        .era("Cretacico")
                        .tamanio(12L)
                        .peso(150L)
                        .dieta("Plantas")
                        .build()
        );

        dinos.add(
                Dinosaurio.builder()
                        .id(4)
                        .nombre("Velocirraptor")
                        .era("Cretacico")
                        .tamanio(1L)
                        .peso(1L)
                        .dieta("Carne")
                        .build()
        );
    };

    public List<Dinosaurio> findAll(){
        return dinos;
    }

    public Optional<Dinosaurio> findById(int id){

        return dinos.stream().filter(a -> a.getId()==id).findFirst();

    }

    public Dinosaurio save(Dinosaurio d) {
        dinos.add(d);
        return d;
    }

    public Dinosaurio edit(Dinosaurio d){

        int pos;

        if((pos = indexOf(d.getId())) == -1)
            return save(d);

        return dinos.set(pos,d);


    }

    public void delete(Dinosaurio d){
        int pos;
        if((pos = indexOf(d.getId()))!=-1)
            dinos.remove(d);

    }

    public int indexOf (int id){

        int pos = -1;

        for (int i=0; i<dinos.size() && pos ==-1; i++){
            if(dinos.get(i).getId() == id)
                pos = i;
        }

        return pos;
    }

}*/


