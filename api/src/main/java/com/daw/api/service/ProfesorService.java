package com.daw.api.service;

import com.daw.api.model.entity.Profesor;
import com.daw.api.repositori.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    public List<Profesor> findAll(){
        return this.profesorRepository.findAll();
    }

    public Profesor findById(int idProf){
        Optional<Profesor> profesorOpcional = this.profesorRepository.findById(idProf);
        Profesor result = null;

        if(profesorOpcional.isPresent()){
            result = profesorOpcional.get();
        }

        return result;
    }

}
