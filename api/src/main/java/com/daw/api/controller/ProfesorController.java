package com.daw.api.controller;

import com.daw.api.model.entity.Alumno;
import com.daw.api.model.entity.Profesor;
import com.daw.api.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProfesorController {
    @Autowired
    private ProfesorService profesorService;

    @GetMapping("/profesor/list")
    public ResponseEntity<?> list(){
        if(this.profesorService.findAll().isEmpty()){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.ok(this.profesorService.findAll());
        }
    }
    @GetMapping("/profesor/{idprof}")
    public Profesor locateById(@PathVariable("idAlum") int idprof){
        return this.profesorService.findById(idprof);
    }

}

