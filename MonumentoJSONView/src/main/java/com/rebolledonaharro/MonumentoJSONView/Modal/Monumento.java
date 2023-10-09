package com.rebolledonaharro.MonumentoJSONView.Modal;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import static com.rebolledonaharro.MonumentoJSONView.Modal.MonumentoView.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Monumento {

    @Id
    @GeneratedValue
    @JsonView({MonumentList.class})
    private Long id;

    @JsonView({MonumentList.class})
    private String nombre;

    @JsonView({MonumentList.class})
    private String codigoPais;

    @JsonView({MonumentList.class})
    private String localizacion;

    @JsonView({MonumentList.class})
    private String localidad;

    @JsonView({MonumentoDetail.class})
    private String descripcion;

    private String urbanizacion;

    @JsonView({MonumentList.class})
    @ElementCollection
    private List<String> imagenes;

    @JsonView({MonumentList.class})
    @ManyToOne
    private Categoria categoria;

    @JsonView({MonumentoEnRuta.class})
    @ManyToOne
    private Ruta ruta;

}
