package com.company;

import com.company.ProfesorAdjunto;
import com.company.ProfesorTitular;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.invoke.WrongMethodTypeException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static final String SEPARADOR = ",";
    public static final String QUOTE = "\"";

    public static void main(String[] args) throws IOException {


        DigitalHouseManager nuevoManager = new DigitalHouseManager();

        //Creo los profesores

        nuevoManager.altaProfesorAdjunto("Tomas", "Contreras", 3819, 2);
        nuevoManager.altaProfesorAdjunto("Jose", "Verdini", 4178, 5);
        nuevoManager.altaProfesorTitular("Pedro", "Fatti", 4370, "Redes sociales");
        nuevoManager.altaProfesorTitular("Chester", "Gonzalez", 1856, "Diseño de paginas web");

        //Creo los cursos

        nuevoManager.altaCurso("Full Stack", 20001, 3);
        nuevoManager.altaCurso("Android", 20002, 18);

        //Asigo profesores a los cursos

        nuevoManager.asignarProfesores(20001, 1856, 4178);
        nuevoManager.asignarProfesores(20002, 4370, 3819);

        //Doy de alta 3 alumnos

        nuevoManager.altaAlumno("Theo", "Musumeci", 113);
        nuevoManager.altaAlumno("Juan", "Perez", 365);
        nuevoManager.altaAlumno("Tomas", "Nuñez", 867);

        //Inscribo 2 alumnos en el curso Full Stack

        nuevoManager.inscribirAlumno(113, 20001);
        nuevoManager.inscribirAlumno(867, 20001);

        //Inscribo 3 alumnos al curso Android

        nuevoManager.inscribirAlumno(113, 20002);
        nuevoManager.inscribirAlumno(867, 20002);
        nuevoManager.inscribirAlumno(365, 20002);

        //Doy de baja un profesor

        nuevoManager.bajaProfesor(4178);

        //Doy de baja un curso

        //nuevoManager.bajaCurso(20002);

        //DESTACADO, lector de archivos CSV

        LectorDeArchivosCSV lectorCSV = new LectorDeArchivosCSV();
        lectorCSV.leerCSVyHacerLista();

        //Para inscribir a los nuevos alumnos de mi lista, hago un foreach


        for (Alumno alumno : lectorCSV.getNuevaListaAlumnos()) {
            //Primero los agrego a la lista de alumnos de DigitalHouseManager
            nuevoManager.altaAlumno(alumno.getNombre(), alumno.getApellido(), alumno.getCodigoDeAlumno());
            //Despues los inscribo al curso de Android
            nuevoManager.inscribirAlumno(alumno.getCodigoDeAlumno(), 20002);
        }
    }
}