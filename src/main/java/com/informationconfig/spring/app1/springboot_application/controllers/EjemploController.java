package com.informationconfig.spring.app1.springboot_application.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.informationconfig.spring.app1.springboot_application.models.Empleados;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info") //Maneja la solicitud HTTP

    public String info(Model model) { //Pasa los datos del controller a la vista

        Empleados empleado1 = new Empleados("Mateo", "Perez", null, "Desarrollador", 30, 123456789, 1);

        model.addAttribute("Empleado", empleado1);
        return "detalles_info";
    }
}