package com.salesianostriana.dam.ejemplosb2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Servicio {

    @NonNull
    private Componente componente;

    private final Componente2 componente2;


    public void run(){
        componente.print();
        componente2.print();
    }


}
