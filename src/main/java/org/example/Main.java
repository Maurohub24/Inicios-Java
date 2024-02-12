package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*double peso = 200;
        double altura = 1.75;
        double IMC;

        IMC = peso / Math.pow (altura, 2);
        if (IMC < 16) {
            System.out.println("Delgadez severa");
        } else if (IMC >= 16 && IMC <= 16.9) {
            System.out.println("Delgadez moderada");
        } else if (IMC > 17 && IMC <= 18.4) {
            System.out.println("Delgadez leve");
        } else if (IMC > 18.5 && IMC <= 24.9) {
            System.out.println("Peso normal");
        } else if (IMC > 25 && IMC <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (IMC > 30 && IMC <= 34.9) {
            System.out.println("Obesidad leve");
        } else if (IMC > 35 && IMC <= 39.9) {
            System.out.println("Obesidad moderada");
        } else {
            System.out.println("Obesidad morbida");
        }*/


        /*int number = 371;
        double digitos;
        double suma = 0;
        int numeroOriginal;
        int ultimoDigito;
        numeroOriginal = number;

        digitos = Math.floor(Math.log10(number)) + 1;

        while (number > 0) {
            ultimoDigito = number % 10;
            suma = suma + Math.pow(ultimoDigito, digitos);
            number = number / 10;
        }
        if (numeroOriginal == suma) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }*/

        Persona persona1 = new Persona("Mauro","Moreno","12345",24091990);
        Persona persona2 = new Persona("Miguel","Molina","12345",24091990);
        Planeta planeta1 = new Planeta("Marte", 2,622692940,685844848, 6794,54600000, Planeta.tipoPlaneta.GASEOSO,true);
        Planeta planeta2 = new Planeta("Jupiter", 7,802692940,895844848, 83454,84600000, Planeta.tipoPlaneta.TERRESTRE, true);
        Automovil automovil1 = new Automovil("Ferrari", 1990, 1500, Automovil.tipoComb.gasolina, Automovil.tipoAuto.familiar, 4, 5, 80, Automovil.col.negro, 60);
        Automovil automovil2 = new Automovil("Lamborgini", 1980, 1500, Automovil.tipoComb.biodiesel, Automovil.tipoAuto.carroCiudad, 2, 3, 180, Automovil.col.amarillo, 100);
        CuentaBancaria cuenta1 = new CuentaBancaria("Carlos", "Munera Vargas",00023212, CuentaBancaria.tipo.corriente,200);
        Avion a1 = new Avion("Airbus",4);
        Avion a2 = new Avion("Lookheed",4);


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
        a1.cambiarFabricante();
        a2.imprimirFabricante();
        a2.cambiarFabricante();

    }
}