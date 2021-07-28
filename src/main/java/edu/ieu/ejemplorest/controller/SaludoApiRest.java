package edu.ieu.ejemplorest.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class SaludoApiRest {
	private AtomicLong contador= new AtomicLong(0);
	
	@GetMapping
	public Saludo hola() {

		long conteo = contador .incrementAndGet();
		return new Saludo("Grupo k019", "Hola mundo Rest,"+ "Cantidad de visitas "+ conteo);
	}
	
	@GetMapping("/{nombre}")
	public Saludo saludar(@PathVariable("nombre")String nombre) {
		long conteo = contador .incrementAndGet();
		return new Saludo(nombre, "Hola "+ nombre + ", " +"Cantidad de visitas "+ conteo);
		
	}
}
