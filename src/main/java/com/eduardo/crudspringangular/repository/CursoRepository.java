package com.eduardo.crudspringangular.repository;

import com.eduardo.crudspringangular.model.Curso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository  extends JpaRepository<Curso, Long>{
    
}
