package com.rebolledonaharro._PracExRest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DinoNotFoundException extends RuntimeException{

    public DinoNotFoundException(Integer id){
        super("Pedro Calvo");
    }

}
