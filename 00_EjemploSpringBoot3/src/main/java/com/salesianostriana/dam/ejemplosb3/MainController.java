package com.salesianostriana.dam.ejemplosb3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @GetMapping("/index/")
    public String index(Model model) {

        model.addAttribute("mensaje","hola a todos los coders de 2DAM");

        return "index";
        /* return "resources/templates/index.html"; */
    }



}
