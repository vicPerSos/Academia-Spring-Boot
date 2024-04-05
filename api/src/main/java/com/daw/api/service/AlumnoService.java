package com.daw.api.service;

import com.daw.api.model.entity.Alumno;
import com.daw.api.repositori.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public List<Alumno> findAll(){
        return this.alumnoRepository.findAll();
    }
}
