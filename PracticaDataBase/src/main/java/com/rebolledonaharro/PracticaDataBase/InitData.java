package com.rebolledonaharro.PracticaDataBase;

import com.rebolledonaharro.PracticaDataBase.modal.Categoria;
import com.rebolledonaharro.PracticaDataBase.modal.LineaPedido;
import com.rebolledonaharro.PracticaDataBase.modal.Pedido;
import com.rebolledonaharro.PracticaDataBase.modal.Producto;
import com.rebolledonaharro.PracticaDataBase.repo.*;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
@RequiredArgsConstructor
public class InitData {


    private final CategoriaRepo categoriaRepo;

    private final ClienteRepo clienteRepo;

    private final LineaPedidoRepo lineaPedidoRepo;

    private final PedidoRepo pedidoRepo;

    private final ProductoRepo productoRepo;


    @PostConstruct
    public void initData(){

        Categoria cat1 = Categoria.builder()
                .nombre("frutas").build();
        categoriaRepo.save(cat1);

        Categoria cat2 = Categoria.builder()
                .nombre("carnes").build();
        categoriaRepo.save(cat2);

        Categoria cat3 = Categoria.builder()
                .nombre("pasta").build();
        categoriaRepo.save(cat3);

        List<String> futatags = new ArrayList<>();

        futatags.add("Saludable");
        futatags.add("Verde");

        Producto p1 = Producto.builder()
                .nombre("manzana")
                .tags(futatags)
                .descripcion("Una manzana")
                .precio(1.8)
                .precioOferta(1.2)
                .categoria(cat1)
                .build();

        productoRepo.save(p1);

        Producto p2 = Producto.builder()
                .nombre("pera")
                .tags(futatags)
                .descripcion("Una pera")
                .precio(2.0)
                .precioOferta(1.5)
                .categoria(cat1)
                .build();

        productoRepo.save(p2);

        Producto p3 = Producto.builder()
                .nombre("lima")
                .tags(futatags)
                .descripcion("Una lima")
                .precio(2.4)
                .precioOferta(1.8)
                .categoria(cat1)
                .build();

        productoRepo.save(p3);





    }

}
