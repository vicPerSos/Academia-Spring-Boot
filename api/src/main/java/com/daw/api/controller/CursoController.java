package com.daw.api.controller;

import com.daw.api.model.entity.Curso;
import com.daw.api.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @GetMapping("/curso/list")
    public List<Curso> list(){
        return this.cursoService.findAll();
    }
}
