package com.salesianostriana.edu.EjercicioREST;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
/*
@Repository
public class MonumentoRepository {

    private List<Monumento> monumentos;


    public MonumentoRepository() {

        monumentos = new ArrayList<>();

        monumentos.add(
                Monumento.builder()
                        .id(1)
                        .nombreMonumento("Estatua 1")
                        .codigoPais("0001")
                        .nombrePais("España")
                        .nombreCiudad("Sevilla")
                        .latitud(3L)
                        .longuitud(4L)
                        .descripcion("chulisimo")
                        .urlFoto("UrlFto")
                        .build() );

        monumentos.add(
                Monumento.builder()
                        .id(1)
                        .nombreMonumento("Estatua 2")
                        .codigoPais("0002")
                        .nombrePais("España")
                        .nombreCiudad("Ubeda")
                        .latitud(1L)
                        .longuitud(1L)
                        .descripcion("chulisimo")
                        .urlFoto("UrlFto")
                        .build());
        monumentos.add(
                 Monumento.builder()
                        .id(1)
                        .nombreMonumento("Estatua 3")
                        .codigoPais("0003")
                        .nombrePais("España")
                        .nombreCiudad("Gerena")
                        .latitud(3L)
                        .longuitud(7L)
                        .descripcion("Peio")
                        .urlFoto("UrlFto")
                        .build());
    }

    public List<Monumento> findAll(){

        return monumentos;
    }

    public Optional<Monumento> findById(int id){

        return monumentos.stream()
                .filter( a -> a.getId() == id)
                .findFirst();

    }

    public Monumento save( Monumento monumento){

        monumentos.add(monumento);
        return monumento;

    }

    public Monumento edit(Monumento m){

        int pos;

        if ((pos = indexOf(m.getId())) == -1){
            save(m);
        }else {

            return monumentos.set(pos,m);
        }


        return null;


    }

    public void delete(Monumento m){

        int pos;
        if((pos = indexOf(m.getId())) == -1){

            monumentos.remove(pos);

        }

    }

    public int indexOf(int id){

        int pos = -1;

        for (int i=0;i<monumentos.size() && pos == -1; i++ ){
            if(monumentos.get(i).getId() == id){
                pos= i;

            }

        }

        return pos;

    }

}*/
