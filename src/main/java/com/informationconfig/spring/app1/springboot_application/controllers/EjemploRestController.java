package com.informationconfig.spring.app1.springboot_application.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.informationconfig.spring.app1.springboot_application.models.dto.ClaseDTO;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping(path = "/detalles_info2")
    
    public ClaseDTO detalles_info() {
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("InformationConfig");
        return usuario1;
    }
}
