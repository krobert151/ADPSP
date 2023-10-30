package com.rebolledonaharro.PracticaDataBase.modal;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LineaPedido {

    @ToString.Include
    @Id
    @Column(nullable = false)
    private String codLinea;

    @ToString.Include
    @Column(name = "precio_unitario", nullable = false)
    private double precioUnitario;

    @ToString.Include
    @Column(name = "cantidad", nullable = false)
    private double cantidad;

    @ManyToOne(optional = false)
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pedido_id")
    @Fetch(FetchMode.JOIN)
    private Pedido pedido;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        LineaPedido that = (LineaPedido) o;
        return getCodLinea() != null && Objects.equals(getCodLinea(), that.getCodLinea());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
