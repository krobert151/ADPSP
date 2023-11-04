package com.rebolledonaharro.PracticaDataBase.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LineaPedidoPK {

    private Pedido pedido;
    private Long codLinea;



}
