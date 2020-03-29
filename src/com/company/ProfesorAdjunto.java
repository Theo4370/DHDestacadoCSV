package com.company;

import java.lang.reflect.AnnotatedArrayType;

public class ProfesorAdjunto extends com.company.Profesor {
    private Integer horasDeConsulta;
    private static final Integer ANTIGUEDAD_INICIAL = 0;

    /**
     * Item I, item 3.
     * Para poder dar de alta un profesor adjunto, solo necesito los parámetros nombre, apellido, codigoDeProfesor y horasDeConsulta, entonces elimino el resto de los parámetros del constructor.
     */

    public ProfesorAdjunto(String nombre, String apellido, Integer codigoDeProfesor, Integer horasDeConsulta) {
        super(nombre, apellido, codigoDeProfesor, ANTIGUEDAD_INICIAL);
        this.horasDeConsulta = horasDeConsulta;
    }

    public Integer getHorasDeConsulta() {
        return horasDeConsulta;
    }

}
