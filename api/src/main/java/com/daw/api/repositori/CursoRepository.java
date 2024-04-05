package com.daw.api.repositori;

import com.daw.api.model.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CursoRepository extends JpaRepository <Curso,Integer>{
    @Query("select c from Curso c")
    List<Curso> findAll();
}
