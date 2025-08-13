package com.spring.app1.springboot_app1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.dto.ClaseDTO;


// url de acceso = http://localhost:8080/api/detalles_info

/*

Qué es: Es una combinación de @Controller + @ResponseBody.

Qué hace: Devuelve datos directamente en formato JSON o XML.
*/

@RestController
@RequestMapping("/api")

public class EjemploRestController {
   //@GetMapping	GET (leer datos)
    @GetMapping(path = "/detalles_info")
    
    /*DTO = Data Transfer Object */
    public ClaseDTO info(){
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Infoconfig");

    

        /* public  Map <String , Object>  info(){ 
        Empleados empleado1 = new Empleados("Edgar", "Perez","cuautitlan", "Gerente", 20, 1234567890, 001);

        Map <String , Object> Respuesta = new HashMap<>();
        Respuesta.put("Empleado", empleado1);


        return Respuesta;*/
        return usuario1;
    }

}
