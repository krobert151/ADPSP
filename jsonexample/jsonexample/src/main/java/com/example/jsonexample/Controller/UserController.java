package com.example.jsonexample.Controller;

import com.example.jsonexample.Model.User;
import com.example.jsonexample.Model.UserView;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    private List<User> usuarios;



    public UserController(List<User> usuarios) {
        this.usuarios = List.of(
                new User(1L, "Manolo", 20),
                new User(2L, "Manolo2", 24),
                new User(3L, "Manolo3", 26),
                new User(4L, "Manolo4", 22)
        );
    }

    @GetMapping("/lista1")
    @JsonView(UserView.UserList1.class)
    public List<User> findAll(){
        return usuarios;
    }

    @GetMapping("/lista2")
    @JsonView(UserView.UserList2.class)
    public List<User> findAll2(){
        return usuarios;
    }
}
