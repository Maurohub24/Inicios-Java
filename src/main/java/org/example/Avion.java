package org.example;

public class Avion {

    public String nombreFabricante;
    public int numeroMotores;

    public Avion(String nombreFabricante, int numeroMotores) {
        this.nombreFabricante = nombreFabricante;
        this.numeroMotores = numeroMotores;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public void imprimirFabricante(){
        System.out.println("El nombre del fabricante es: " + nombreFabricante);
    }

    public void cambiarFabricante(Avion a){
        String Airplan;

        a== Airplan;
        nombreFabricante == a;

        return a;
    }


}
