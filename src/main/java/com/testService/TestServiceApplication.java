package com.testService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/*
* Exemplo básico de um comentário em JavaDoc com mais de uma linha.
* teste teste teste.
*/
@SpringBootApplication
/*
* Exemplo básico de um comentário em JavaDoc com mais de uma linha.
*  teste teste teste.
*/
@ComponentScan(basePackageClasses = { TestController.class })
/*
* Exemplo básico de um comentário em JavaDoc com mais de uma linha.
* teste teste teste.
*/
@EnableAutoConfiguration
/*
* Exemplo básico de um comentário em JavaDoc com mais de uma linha.
* @return teste teste teste.
*/
public class TestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestServiceApplication.class, args);
		System.exit(0);
	}

}
