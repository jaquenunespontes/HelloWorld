package org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //informa que é um controller
@RequestMapping("/helloworld") //informa que é um end de web 
public class helloController {
	
	@GetMapping //pega inf do metodo e exibe
	public String hello() {
		return "Hello World! Seja, bem vinda ao Spring!";
		
	}
	

}
