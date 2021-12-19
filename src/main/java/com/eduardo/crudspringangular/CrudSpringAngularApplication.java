package com.eduardo.crudspringangular;

import com.eduardo.crudspringangular.model.Curso;
import com.eduardo.crudspringangular.repository.CursoRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringAngularApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CursoRepository cursoRepository){
		return args -> {

			cursoRepository.deleteAll();

			Curso c = new Curso();

			c.setNome("Angular");
			c.setCategoria("Front-End");

			cursoRepository.save(c);
		};
	}
}
