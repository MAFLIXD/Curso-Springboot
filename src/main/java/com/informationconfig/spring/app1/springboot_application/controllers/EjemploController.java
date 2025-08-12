package com.informationconfig.spring.app1.springboot_application.controllers;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.informationconfig.spring.app1.springboot_application.models.Empleados;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info") //Maneja la solicitud HTTP

    public String info(Model model) { //Pasa los datos del controller a la vista
        Empleados empleado1 = new Empleados("Mateo", "Perez", null, "Desarrollador", 30, 123456789, 1);
        model.addAttribute("Empleado", empleado1);
        return "detalles_info";
    }

    @ModelAttribute("Empleados")
    public List<Empleados> getEmpleados() {
        return Arrays.asList(
            new Empleados("Mateo", "Perez", null, "Desarrollador", 30, 123456789, 1),
            new Empleados("Ana", "Gomez", null, "Diseñadora", 28, 987654321, 2),
            new Empleados("Luis", "Martinez", null, "Gerente", 35, 456789123, 3),
            new Empleados("Sofia", "Lopez", null, "Analista", 32, 321654987, 4)
        );
    }
}