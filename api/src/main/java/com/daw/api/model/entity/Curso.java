package com.daw.api.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Curso {
    @Id
    private int idCurso;
    private String nombre;
    private int maxAlum;
    private Date fInicio;
    private Date fFin;
    private int numHoras;

    @ManyToOne
    @JoinColumn(name="id_Prof")
    private Profesor profesor;

}
