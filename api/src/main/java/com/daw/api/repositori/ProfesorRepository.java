package com.daw.api.repositori;

import com.daw.api.model.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProfesorRepository extends JpaRepository <Profesor,Integer>{
    @Query("select p from Profesor p")
    List<Profesor> findAll();

    @Query("select a from Alumno a where a.id = :id")
    Optional<Profesor> findById(@Param("id") Integer idProf);
}
