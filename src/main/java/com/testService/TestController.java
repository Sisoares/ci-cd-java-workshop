

package com.testService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*
* Exemplo básico de um comentário em JavaDoc com mais de uma linha.
* @return teste teste teste.
*/
@RestController /*
* Exemplo básico de um comentário em JavaDoc com mais de uma linha.
* @return teste teste teste.
*/
@CrossOrigin
public class TestController {
@GetMapping("/home")
		public String homeRequest() {
		return "Hello World!";
	}
}
