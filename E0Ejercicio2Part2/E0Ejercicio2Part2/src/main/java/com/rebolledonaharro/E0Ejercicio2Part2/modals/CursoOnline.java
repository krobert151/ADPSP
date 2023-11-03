package com.rebolledonaharro.E0Ejercicio2Part2.modals;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Curso")
public class CursoOnline {

    @ToString.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @ToString.Include
    private String nombre;

    @ToString.Include
    @Column(nullable = false)
    private double puntuacion;

    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesor profesor;

    @OneToMany(mappedBy = "cursoOnline",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Video> videos = new ArrayList<>();

    public void addVideo(Video video){

        videos.add(video);
        video.setCursoOnline(this);

    }

    public void removeVideo(Video video){
        videos.remove(video);
        video.setCursoOnline(null);


    }


    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        CursoOnline that = (CursoOnline) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }


}
