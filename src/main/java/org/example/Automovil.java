package org.example;

import java.sql.SQLOutput;

public class Automovil {
    String marca;
    public int modelo;
    public double motor;
    public enum tipoComb {gasolina, bioetanol, diesel, biodiesel, gasNatural};
    tipoComb tipoCombustible;
    public enum tipoAuto {carroCiudad, subcompacto, compacto, familiar, ejecutivo, SUV};
    tipoAuto tipoAutomovil;
    public int cantidadPuertas;
    public int cantidadAsientos;
    public double velocidadMaxima;
    public enum col {blanco, negro, rojo, naranja, amarillo, verde, azul, violeta};
    col color;
    public double velocidadActual;

    Automovil(String marca,int modelo, double motor, tipoComb tipoCombustible, tipoAuto tipoAutomovil,
              int cantidadPuertas, int cantidadAsientos, double velocidadMaxima, col color, double velocidadActual){
            this.marca = marca;
            this.modelo = modelo;
            this.motor = motor;
            this.tipoCombustible = tipoCombustible;
            this.tipoAutomovil = tipoAutomovil;
            this.cantidadPuertas = cantidadPuertas;
            this.cantidadAsientos = cantidadAsientos;
            this.velocidadMaxima = velocidadMaxima;
            this.color = color;
            this.velocidadActual = velocidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void acelerar(){
        velocidadActual = 0;
        velocidadMaxima = 80;

        if(velocidadMaxima <= 120){
            System.out.println("Su velocidad está dentro de los límites");
        } else {
            System.out.println("Superaste los límites de velocidad permitidos");
        }
    }

    public void desacelerar(int decremento){

        if(velocidadActual - decremento < 0){
            System.out.println("No puedes ir a una velocidad inferior");
        } else {
            System.out.println("Su velocidad está dentro de lo permitido");
        }
    }

    public static void frenar (){
            System.out.println("Usted ha frenado");
    }

    public double tiempoLlegada(int distancia){
        double tiempoEstimado;

        tiempoEstimado = distancia/velocidadActual;

        return  tiempoEstimado;
    }

    public void imprimirAutomovil(){
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(motor);
        System.out.println(tipoCombustible);
        System.out.println(tipoAutomovil);
        System.out.println(cantidadPuertas);
        System.out.println(cantidadAsientos);
        System.out.println(velocidadMaxima);
        System.out.println(color);
        System.out.println(velocidadActual);
    }


}
