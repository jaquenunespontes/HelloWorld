package org.generation.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class aprendizado {
	
	@GetMapping
	public String Hello() { 
		
		return "Aprofundar em MySQL, focar em DER no projeto integrador e adquirir mais entendimento sobre spring";
		
		
	}
	
}
