package org.example;

public class CuentaDeAhorros extends CuentasBancarias {

    public boolean valorCuenta;
    public boolean activa;

    public CuentaDeAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }


    public boolean verificarModoCuenta() {

        if (saldo < 10000) {
            activa = false;
            System.out.println("Su cuenta no se encuentra Inactiva");
            return false;
        } else {
            activa = true;
            System.out.println("Su cuenta se encuentra Activa");
            return true;
        }
    }

    public void consignarDinero(float cantidad) {
        if (activa) {
            super.calcularConsignarDinero(cantidad);
        }
    }

    public void retirarDinero(float retiro) {
        if (activa = false) {
            super.calcularRetirarDinero(retiro);
        }
    }

    public void extractoMensual() {
        float retiros;
        float comision = 1000;
        if (retiros > 4) {
            super.calcularExtractoMensual(10) + comision + activa + saldo;
        }
    }

    public void imprimirSaldos() {
        System.out.println("El saldo es: " + saldo);
        System.out.println("La comisión mensual es: " + comisionMensual);
        System.out.println("El número de transacciones realizadas son: " + numeroConsignaciones);
    }

}
