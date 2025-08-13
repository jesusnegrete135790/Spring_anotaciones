package com.spring.app1.springboot_app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringbootApp1Application {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootApp1Application.class, args);


		
		/*
Anotación	Para solicitudes HTTP
	@GetMapping	GET (leer datos)
	@PostMapping	POST (crear datos)


Estas no se encuentran en el proyecto, igual son anotación Para solicitudes HTTP
	@PutMapping	PUT (actualizar datos)
	@DeleteMapping	DELETE (eliminar datos)
	@RequestMapping	General, configurable con cualquier método HTTP
		*/
	}

}
