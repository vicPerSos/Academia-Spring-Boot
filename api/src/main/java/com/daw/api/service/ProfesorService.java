package com.daw.api.service;

import com.daw.api.model.entity.Profesor;
import com.daw.api.repositori.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    public List<Profesor> findAll(){
        return this.profesorRepository.findAll();
    }

}
