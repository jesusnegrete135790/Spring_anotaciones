package com.spring.app1.springboot_app1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import models.Empleados;


/*
Controller
Qué es: Una anotación que marca una clase como controlador web (MVC).

Qué hace: Permite manejar solicitudes HTTP y devolver vistas (HTML/JSP) en aplicaciones web.
*/
@Controller
public class EjemploController {
   //@GetMapping	GET (leer datos)
    @GetMapping("/detalles_info")

    public String info(Model model){ //puede ser cualquier tipo de dato
    
        Empleados empleado1 = new Empleados("Edgar", "Perez","cuautitlan", "Gerente", 20, 1234567890, 001);
        
        model.addAttribute("Empleado", empleado1);
        
        
        model.addAttribute("Titulo", "Servidor en linea");
        model.addAttribute("Servidor", "Infoconfig");
        model.addAttribute("Ip", "192.168.1.1");

        return "detalles_info";
    }

}
