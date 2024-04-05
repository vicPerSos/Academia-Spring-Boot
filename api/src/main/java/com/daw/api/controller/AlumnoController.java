package com.daw.api.controller;

import com.daw.api.model.entity.Alumno;
import com.daw.api.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/alumno/list")
    public List<Alumno> list(){
        return this.alumnoService.findAll();
    }
}
