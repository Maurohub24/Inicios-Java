package org.example;

public class CuentaBancaria {

    public String nombreTitular;
    public String apellidosTitular;
    public double numeroCuenta;

    public enum tipo {ahorros, corriente}

    ;
    tipo tipoCuenta;
    public double saldo = 0;


    CuentaBancaria(String nombreTitular, String apellidosTitular, double numeroCuenta, tipo tipoCuenta, double saldo) {
        this.nombreTitular = nombreTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public void imprimirCuentas() {
        System.out.println(nombreTitular);
        System.out.println(apellidosTitular);
        System.out.println(numeroCuenta);
        System.out.println(tipoCuenta);
        System.out.println(saldo);
    }

    public void saldoBancaria() {
        System.out.println("Ingresa tu nombre:");
        System.out.println("Ingresa tu apellido:");
        System.out.println("Ingresa tu numero de cuenta");
        System.out.println("Ingresa tu tipo de cuenta");

    }

    public double consignarCuenta(double saldoConsignado) {

        double nuevaConsignacion = saldoConsignado;
        double nuevoSaldo;

        nuevoSaldo = nuevaConsignacion + saldo;
        return nuevoSaldo;
    }

    public void retirarCuenta(double saldoRetiro) {
        double retirocuenta = saldoRetiro;
        double nuevoSaldo;

        if (retirocuenta > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            nuevoSaldo =  saldo - retirocuenta;
            System.out.println("Su nuevo saldo es:" + nuevoSaldo);
        }
    }

}
