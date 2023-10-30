package com.rebolledonaharro.PracticaDataBase.modal;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;
@Entity
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Producto {
    @ToString.Include
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @ToString.Include
    @Column(name = "nombre")
    private String nombre;

    @ToString.Include
    @Column(name = "url_imagen")
    private String urlImagen;

    @ToString.Include
    @Column(name = "descripcion")
    private String descripcion;

    @ToString.Include
    @Column(name = "precio", nullable = false)
    private double precio;

    @ToString.Include
    @Column(name = "preico_oferta", nullable = false)
    private double precioOferta;

    @ToString.Include
    @ElementCollection
    @Column(name = "tag")
    @CollectionTable(name = "Producto_tags", joinColumns = @JoinColumn(name = "owner_id"))
    private List<String> tags = new ArrayList<>();

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id", nullable = false)
    @Fetch(FetchMode.JOIN)
    private Categoria categoria;

}
