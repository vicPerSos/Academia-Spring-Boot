package com.daw.api.repositori;

import com.daw.api.model.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AlumnoRepository extends JpaRepository <Alumno,Integer>{
    @Query("select a from Alumno a")
    List<Alumno> findAll();



    @Query("select a from Alumno a where a.id = :id")
    Optional<Alumno> findById(@Param("id") Integer idAlum);

}
