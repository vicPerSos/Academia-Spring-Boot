package com.daw.api.repositori;

import com.daw.api.model.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CursoRepository extends JpaRepository <Curso,Integer>{
    @Query("select c from Curso c")
    List<Curso> findAll();

    @Query("select c from Curso c where c.Id = :id")
    Optional<Curso> findById(@Param("id") Integer idCurso);

}
