package com.daw.api.repositori;

import com.daw.api.model.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfesorRepository extends JpaRepository <Profesor,Integer>{
    @Query("select p from Profesor p")
    List<Profesor> findAll();

}
