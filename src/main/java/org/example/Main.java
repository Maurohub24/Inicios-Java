package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Persona persona1 = new Persona("Mauro", "Moreno", "12345", 24091990);
        Persona persona2 = new Persona("Miguel", "Molina", "12345", 24091990);
        Planeta planeta1 = new Planeta("Marte", 2, 622692940, 685844848, 6794, 54600000, Planeta.tipoPlaneta.GASEOSO, true);
        Planeta planeta2 = new Planeta("Jupiter", 7, 802692940, 895844848, 83454, 84600000, Planeta.tipoPlaneta.TERRESTRE, true);
        Automovil automovil1 = new Automovil("Ferrari", 1990, 1500, Automovil.tipoComb.gasolina, Automovil.tipoAuto.familiar, 4, 5, 80, Automovil.col.negro, 60);
        Automovil automovil2 = new Automovil("Lamborgini", 1980, 1500, Automovil.tipoComb.biodiesel, Automovil.tipoAuto.carroCiudad, 2, 3, 180, Automovil.col.amarillo, 100);
        CuentaBancaria cuenta1 = new CuentaBancaria("Carlos", "Munera Vargas", 00023212, CuentaBancaria.tipo.corriente, 200);
        Avion a1 = new Avion("Airbus", 4);
        Avion a2 = new Avion("Lookheed", 4);


        persona1.imprimir();
        persona2.imprimir();
        planeta1.imprimirPlanetas();
        System.out.println("El valor de la densidad es " + planeta1.calcularDensidad());
        planeta1.planetaExterior();
        planeta2.imprimirPlanetas();
        planeta2.calcularDensidad();
        planeta2.planetaExterior();
        automovil1.imprimirAutomovil();
        automovil1.acelerar();
        automovil1.desacelerar(50);
        automovil1.frenar();
        automovil1.tiempoLlegada(20);

        automovil2.imprimirAutomovil();
        automovil2.acelerar();
        automovil2.desacelerar(50);
        automovil2.frenar();
        automovil2.tiempoLlegada(20);
        Automovil.frenar();

        cuenta1.imprimirCuentas();

        a1.imprimirFabricante();
        a2.imprimirFabricante();


        String cad = "4.2,7.1,2.8,9.0";
        String[] valorEntrante = cad.split((","));
        double mediaResultante = 0;
        for (String numero: valorEntrante){
            double numero1 = Double.parseDouble(numero);
            mediaResultante += numero1;
        }
        double media = mediaResultante / valorEntrante.length;
        System.out.println("La media es: " + media);
    }
}