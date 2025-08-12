package com.informationconfig.spring.app1.springboot_application.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/parametros")
public class RequestParamController {

    @GetMapping("/detalle")
    public ParametroDTO detalle(@RequestParam(required = false, defaultValue = "Hello world") String informacion) {
        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(informacion);
        return parametro1;
    }
    

}
