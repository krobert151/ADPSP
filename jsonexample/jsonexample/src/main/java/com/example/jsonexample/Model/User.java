package com.example.jsonexample.Model;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class User {

    @JsonView({UserView.UserList1.class})
    private Long id;

    @JsonView({UserView.UserList1.class})
    private String nombre;

    @JsonView({UserView.UserList2.class})
    private Integer edad;

    public User() {
    }

    public User(Long id, String nombre, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(nombre, user.nombre) && Objects.equals(edad, user.edad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, edad);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
