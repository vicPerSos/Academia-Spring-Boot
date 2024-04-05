package com.daw.api.controller;

import com.daw.api.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
