package org.generation.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class bsm {
	
	@GetMapping
	public String hello() {
	return "Mentalidade de crescimento, persistencia, responsabilidade pessoal oientação ao futuro, comunicação, orientação ao detalhe, proatividade e trabalho em equipe";
			

}
}