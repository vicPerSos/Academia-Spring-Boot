package com.daw.api.repositori;

import com.daw.api.model.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlumnoRepository extends JpaRepository <Alumno,Integer>{
    @Query("select a from Alumno a")
    List<Alumno> findAll();

}
