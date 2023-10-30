package com.rebolledonaharro.PracticaDataBase.repo;

import com.rebolledonaharro.PracticaDataBase.modal.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepo extends JpaRepository<Producto,Long> {
}
