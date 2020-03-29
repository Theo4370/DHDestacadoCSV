package com.company;

import java.util.Objects;

public class Alumno {
    private String nombre;
    private String apellido;
    private Integer codigoDeAlumno;

    public Alumno(String nombre, String apellido, Integer codigoDeAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoDeAlumno = codigoDeAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getCodigoDeAlumno() {
        return codigoDeAlumno;
    }

    public void setCodigoDeAlumno(Integer codigoDeAlumno) {
        this.codigoDeAlumno = codigoDeAlumno;
    }

//Aca redefino el equals para cumplir con la condicion del item 4 de la parte A.

    @Override
    public boolean equals(Object alumnoAComparar) {
        if (!(alumnoAComparar instanceof Alumno)) {
            return false;
        }

        Alumno otroAlumno = (Alumno) alumnoAComparar;
        return otroAlumno.getCodigoDeAlumno().equals(this.codigoDeAlumno);

    }
}

