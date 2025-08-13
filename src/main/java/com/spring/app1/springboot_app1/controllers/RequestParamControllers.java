package com.spring.app1.springboot_app1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


// url de acceso = http://localhost:8080/api/parametros/detalles?=aprendiendo%20SPring


/*
@RestController
Qué es: Es una combinación de @Controller + @ResponseBody.

Qué hace: Devuelve datos directamente en formato JSON o XML.
*/
@RestController
@RequestMapping("/api/parametros")

public class RequestParamControllers {
   // @GetMapping	GET (leer datos)
        @GetMapping("/detalles")
        public ParametroDTO detalle(@RequestParam (required = false, defaultValue = "Bienvenidos a todos" )String informacion){
            
            ParametroDTO parametro1 = new ParametroDTO();
            parametro1.setInformacion(informacion);
            return parametro1;
        }

}
