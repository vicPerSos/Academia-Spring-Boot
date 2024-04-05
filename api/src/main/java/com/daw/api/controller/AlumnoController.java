package com.daw.api.controller;

import com.daw.api.model.entity.Alumno;
import com.daw.api.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/alumno/list")
    public ResponseEntity<?> list(){
        if(this.alumnoService.findAll().isEmpty()){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.ok(this.alumnoService.findAll());
    }
    }

    @GetMapping("/alumno/{idAlum}")
    public Alumno locateById(@PathVariable("idAlum") int idAlum){
        return this.alumnoService.findById(idAlum);
    }

}
