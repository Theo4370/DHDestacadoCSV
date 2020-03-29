package com.company;

public class ProfesorTitular extends com.company.Profesor {
    private String especialidad;
    private static final Integer ANTIGUEDAD_INICIAL = 0;
    /**
     * Item I, item 3.
     * Para poder dar de alta un profesor titular, solo necesito los parámetros nombre, apellido, codigoDeProfesor y especialidad, entonces elimino el resto de los parámetros del constructor.
     */

    public ProfesorTitular(String nombre, String apellido, Integer codigoDeProfesor, String especialidad) {
        super(nombre, apellido, codigoDeProfesor, ANTIGUEDAD_INICIAL);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

}
