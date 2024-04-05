package com.daw.api.service;

import com.daw.api.model.entity.Curso;
import com.daw.api.repositori.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> findAll(){
        return this.cursoRepository.findAll();
    }
}
