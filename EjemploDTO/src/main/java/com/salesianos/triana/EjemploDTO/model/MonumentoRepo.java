package com.salesianos.triana.EjemploDTO.model;

import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonumentoRepo extends JpaRepository<Monumento, Long> {

}
