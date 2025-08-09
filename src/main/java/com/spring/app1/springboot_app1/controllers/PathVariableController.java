package com.spring.app1.springboot_app1.controllers;

import org.springframework.web.bind.annotation.RestController;

import models.Empleados;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



// url de acceso = http://localhost:8080/api/variables/pagina/hola%20mundo

@RestController
@RequestMapping("/api/variables")
public class PathVariableController {

    @Value("${config.codigo}")
    private int codigo;

    @Value("${config.usuario}")
    private String usuario;

    @Value("${config.mensaje}")
    private String mensaje;

    @Value("${config.valores}")
    private String valores;

    @GetMapping("/pagina/{mensaje}")
    public ParametroDTO pagina1(@PathVariable String mensaje){

        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(mensaje);
        return parametro1;
    }

     
    @PostMapping("/solicitud")
    public Empleados creaEmpleados(@RequestBody Empleados empleados){
        return empleados;
    }
    

    @GetMapping("/valores")
    public Map<String,Object> values(){
        Map<String,Object>json= new HashMap<>();

        json.put("Codigo",codigo);
        json.put("Usuario", usuario);
        json.put("Mensaje",mensaje);
        json.put("Valores",valores);

        return json;
    }

    


}
