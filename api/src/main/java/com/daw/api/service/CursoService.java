package com.daw.api.service;


import com.daw.api.model.entity.Curso;
import com.daw.api.repositori.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> findAll(){
        return this.cursoRepository.findAll();
    }

    public Curso findById(int idCurso){
        Optional<Curso> cursoOpcional = this.cursoRepository.findById(idCurso);
        Curso result = null;

        if(cursoOpcional.isPresent()){
            result = cursoOpcional.get();
        }

        return result;
    }


}
