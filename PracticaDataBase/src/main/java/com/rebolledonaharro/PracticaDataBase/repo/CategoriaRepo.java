package com.rebolledonaharro.PracticaDataBase.repo;

import com.rebolledonaharro.PracticaDataBase.modal.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CategoriaRepo extends JpaRepository<Categoria, Long> {
}
