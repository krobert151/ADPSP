package com.rebolledonaharro.PracticaDataBase.repo;

import com.rebolledonaharro.PracticaDataBase.modal.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClienteRepo extends JpaRepository<Cliente, Long> {
}
