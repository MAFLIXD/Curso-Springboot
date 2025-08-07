package com.informationconfig.spring.app1.springboot_application.controllers;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")

public class EjemploRestController {

    @GetMapping(path = "/detalles_info2")
    
    public  Map<String, Object> detalles_info2 () {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Titulo", "Servidor en linea");
        respuesta.put("Servidor", "Informacion Configurada");
        respuesta.put("Version", "2.0.0");
        return respuesta;
    }
}
