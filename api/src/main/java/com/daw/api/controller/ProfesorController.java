package com.daw.api.controller;

import com.daw.api.model.entity.Profesor;
import com.daw.api.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfesorController {
    @Autowired
    private ProfesorService profesorService;

    @GetMapping("/profesor/list")
    public List<Profesor> list(){
        return this.profesorService.findAll();
    }
}
