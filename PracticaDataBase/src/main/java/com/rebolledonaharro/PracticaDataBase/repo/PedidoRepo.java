package com.rebolledonaharro.PracticaDataBase.repo;

import com.rebolledonaharro.PracticaDataBase.modal.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PedidoRepo extends JpaRepository<Pedido,Long> {
}
