package org.example;

import java.util.Date;

public class Persona {

    String nombre;
    String apellido;
    String documento;
    int fecha;

    Persona (String nombrePersona, String apellidoPersona, String documentoPersona, int fechaPersona){
        nombre= nombrePersona;
        apellido= apellidoPersona;
        documento= documentoPersona;
        fecha= fechaPersona;
    }

    public void imprimir(){
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(documento);
        System.out.println(fecha);
    }
}
