package com.informationconfig.spring.app1.springboot_application.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class EjemploController {

    @GetMapping("/detalles_info")

    
    public String info(Model model) {
        model.addAttribute("Titulo", "Servidor en linea");
        model.addAttribute("Servidor", "Informacion Configurada");
        model.addAttribute("Version", "1.0.0");
        return "detalles_info";
    }
}
