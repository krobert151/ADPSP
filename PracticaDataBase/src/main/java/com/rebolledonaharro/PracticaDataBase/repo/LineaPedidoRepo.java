package com.rebolledonaharro.PracticaDataBase.repo;

import com.rebolledonaharro.PracticaDataBase.modal.LineaPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LineaPedidoRepo extends JpaRepository<LineaPedido,String> {
}
