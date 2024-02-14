package org.example;

public class CuentasBancarias {
    protected  float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public CuentasBancarias(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public float calcularConsignarDinero (float dineroConsignado){
        float nuevoSaldo;
        nuevoSaldo = saldo;
        nuevoSaldo = saldo + dineroConsignado;
        System.out.println("Su nuevo saldo es: " + nuevoSaldo);
        numeroConsignaciones ++;
        return nuevoSaldo;
    }

    public float calcularRetirarDinero(float dineroRetirado){
       float retiroSaldo;
       retiroSaldo = saldo;
       if(dineroRetirado <= saldo){
           retiroSaldo = saldo - dineroRetirado;
       }else {
           System.out.println("Saldo insuficiente");
       }
        System.out.println("Su nuevo saldo después de retirar es: " + retiroSaldo);
       numeroRetiros ++;
       return retiroSaldo;
    }

    public float calcularInteresMensual(float interes){
        float interesMensual;
        interesMensual= saldo + (saldo*(interes/100));
        System.out.println("Su saldo más el interés mensual es: " + interesMensual);
        return  interesMensual;
    }

    public float calcularExtractoMensual(float comisionMensual){
        saldo = saldo - comisionMensual + calcularInteresMensual(2);
        System.out.println("Su extracto mensual es: " + saldo);
        return saldo;
    }

    public void imprimirCuentas(){
        System.out.println("Su saldo es: " + saldo);
        System.out.println("Su numero de consignaciones son: " + numeroConsignaciones);
        System.out.println("Su numero de retiros son: " + numeroRetiros);
        System.out.println("Su tasa anual es: " + tasaAnual);
        System.out.println("Su comisión mensual es: " + comisionMensual);
    }
}
