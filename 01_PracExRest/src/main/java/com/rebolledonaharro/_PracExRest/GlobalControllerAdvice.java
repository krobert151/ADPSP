package com.rebolledonaharro._PracExRest;

import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalControllerAdvice {
    @ExceptionHandler(DinoNotFoundException.class)
    public ResponseEntity<DinoError> handleDinoNoEncontrado(DinoNotFoundException ex){
        /*DinoError dinoError = new DinoError();
        dinoError.setEstado(HttpStatus.NOT_FOUND);
        dinoError.setFecha(LocalDateTime.now());
        dinoError.setMensaje(ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(dinoError);
        */

        DinoError dinoError = new DinoError();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(dinoError);

    }

    @ExceptionHandler(JsonMappingException.class)
    public ResponseEntity<DinoError> handleJsonMappingException(JsonMappingException ex){

        /*DinoError dinoError = new DinoError();
        dinoError.setEstado(HttpStatus.BAD_REQUEST);
        dinoError.setFecha(LocalDateTime.now());
        dinoError.setMensaje(ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dinoError);*/
        DinoError dinoError = new DinoError();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dinoError);

    }

}
