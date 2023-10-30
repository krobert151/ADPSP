package com.rebolledonaharro.PracticaDataBase.modal;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Builder
@Entity
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    @ToString.Include
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    @ToString.Include
    private LocalDate fecha;

    @OneToMany(mappedBy = "pedido", orphanRemoval = true)
    @Fetch(FetchMode.SUBSELECT)
    private List<LineaPedido> lineaPedidoes = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    @Fetch(FetchMode.JOIN)
    private Cliente cliente;

    public void addLineaPedido(LineaPedido lineaPedido){
        this.lineaPedidoes.add(lineaPedido);
        lineaPedido.setPedido(this);
    }

    public void removeLineaPedido(LineaPedido lineaPedido){
        lineaPedido.setCodLinea(null);
        this.lineaPedidoes.remove(lineaPedido);

    }

}
