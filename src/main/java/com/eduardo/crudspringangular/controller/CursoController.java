package com.eduardo.crudspringangular.controller;

import java.util.List;

import com.eduardo.crudspringangular.model.Curso;
import com.eduardo.crudspringangular.repository.CursoRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/curso")
@AllArgsConstructor
public class CursoController {

    private final CursoRepository cursoRepository;

    @GetMapping
    public List<Curso> lista(){

        return cursoRepository.findAll();

    }


    
    
}
