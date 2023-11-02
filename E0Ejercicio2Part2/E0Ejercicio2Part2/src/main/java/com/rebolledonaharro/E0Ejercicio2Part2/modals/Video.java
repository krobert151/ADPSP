package com.rebolledonaharro.E0Ejercicio2Part2.modals;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@RequiredArgsConstructor
@IdClass(VideoPK.class)
@Builder
public class Video {

    @Id
    @ManyToOne
    private CursoOnline cursoOnline;

    @Id
    @GeneratedValue
    private Long videoCode;


    @ToString.Include
    private Long orden;

    @ToString.Include
    private String titulo;

    @ToString.Include
    private String descripcion;

    @ToString.Include
    private String url;




    public VideoPK getVideoPK (){
        return new VideoPK(cursoOnline, videoCode);

    }

    public void setId(VideoPK videoPK){
        this.cursoOnline = videoPK.getCursoOnline();
        this.videoCode = videoPK.getVideoCode();

    }

}
