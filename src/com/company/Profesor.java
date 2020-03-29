package com.company;

public abstract class Profesor {
    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private Integer codigoDeProfesor;


    public Profesor(String nombre, String apellido, Integer codigoDeProfesor, Integer antiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
        this.codigoDeProfesor = codigoDeProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getCodigoDeProfesor() {
        return codigoDeProfesor;
    }


    @Override
    public boolean equals(Object profesorAComparar) {
        if (!(profesorAComparar instanceof Profesor)) {
            return false;
        }

        Profesor otroProfesor = (Profesor) profesorAComparar;
        return otroProfesor.getCodigoDeProfesor().equals(this.codigoDeProfesor);

    }
}
