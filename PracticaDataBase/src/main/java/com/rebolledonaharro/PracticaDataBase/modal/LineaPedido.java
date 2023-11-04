package com.rebolledonaharro.PracticaDataBase.modal;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@IdClass(LineaPedidoPK.class)
public class LineaPedido {

   @Id
   @ManyToOne
   private Pedido pedido;

   @Id
   @GeneratedValue
   private Long codLinea;

    @ToString.Include
    @Column(name = "precio_unitario", nullable = false)
    private double precioUnitario;

    @ToString.Include
    @Column(name = "cantidad", nullable = false)
    private double cantidad;

    @ManyToOne(optional = false)
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    public LineaPedidoPK getId(){
        return new LineaPedidoPK(pedido, codLinea);
    }

    public void setId(LineaPedidoPK pk){
        this.pedido=pk.getPedido();
        this.codLinea=pk.getCodLinea();
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        LineaPedido that = (LineaPedido) o;
        return getPedido() != null && Objects.equals(getPedido(), that.getPedido())
                && getCodLinea() != null && Objects.equals(getCodLinea(), that.getCodLinea());
    }

    @Override
    public final int hashCode() {
        return Objects.hash(pedido, codLinea);
    }
}
