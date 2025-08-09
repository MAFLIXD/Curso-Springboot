package com.informationconfig.spring.app1.springboot_application.controllers;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.informationconfig.spring.app1.springboot_application.models.Empleados;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")

public class EjemploRestController {

    @GetMapping(path = "/detalles_info2")
    
    public  Map<String, Object> detalles_info2 () {

        Empleados empleado1 = new Empleados("Mateo", "Perez", "Calle Falsa 123", "Desarrollador", 30, 123456789, 1);

        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Empleado", "Datos Empleado");
        respuesta.put("Informacion", empleado1); 
        return respuesta;
    }
}
