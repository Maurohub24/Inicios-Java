package org.example;

public class Planeta {

    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaSol = 0;

    enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO};
    tipoPlaneta tipo;
    boolean observable = false;

    Planeta (String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaSol,
             tipoPlaneta tipo, boolean observable){
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.observable = observable;
    }

    public void imprimirPlanetas(){
        System.out.println(nombre);
        System.out.println(cantidadSatelites);
        System.out.println(masa);
        System.out.println(volumen);
        System.out.println(diametro);
        System.out.println(distanciaSol);
        System.out.println(tipo);
        System.out.println(observable);
    }

    public double calcularDensidad(){
        double densidad;
        densidad = (masa/volumen);

        return densidad;
    }

    public boolean planetaExterior(){
        float unidadAstronomica = (float) (149597870 * 3.4);

        if(distanciaSol > unidadAstronomica){
            return true;
        } else {
            return false;
        }
    }
}