package com.company;

import java.io.*;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class LectorDeArchivosCSV {
    List<Alumno> nuevaListaAlumnos = new ArrayList<>();

    public void leerCSVyHacerLista() throws IOException {

        BufferedReader listadoDeAlumnos = null;

        listadoDeAlumnos = new BufferedReader(new FileReader("src/com/company/listadoDeAlumnos.csv"));
        String alumnoIndividual = listadoDeAlumnos.readLine();
        while (null != alumnoIndividual) {
            String[] fields = alumnoIndividual.split(",");
            Alumno alumno = new Alumno(fields[1], fields[2], Integer.parseInt(fields[0]));
            nuevaListaAlumnos.add(alumno);
            alumnoIndividual = listadoDeAlumnos.readLine();
        }
        if (null != listadoDeAlumnos) {
            listadoDeAlumnos.close();
        }
    }

    public List<Alumno> getNuevaListaAlumnos() {
        return nuevaListaAlumnos;
    }
}
