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

    public void calcularConsignarDinero (float dineroConsignado){
        saldo = saldo + dineroConsignado;
        System.out.println("Su nuevo saldo es: " + saldo);
        numeroConsignaciones ++;
    }

    public void calcularRetirarDinero(float dineroRetirado){
       if(dineroRetirado <= saldo){
           saldo = saldo - dineroRetirado;
       }else {
           System.out.println("Saldo insuficiente");
       }
        System.out.println("Su nuevo saldo después de retirar es: " + saldo);
       numeroRetiros ++;
    }

    public void calcularInteresMensual(float interes){
        float interesMensual;
        interesMensual= saldo + (saldo*(interes/100));
        System.out.println("Su saldo más el interés mensual es: " + interesMensual);
    }

    public void calcularExtractoMensual(){
        saldo = saldo - comisionMensual;
        calcularInteresMensual(2);
        System.out.println("Su extracto mensual es: " + saldo);
    }

    public void imprimirCuentas(){
        System.out.println("Su saldo es: " + saldo);
        System.out.println("Su numero de consignaciones son: " + numeroConsignaciones);
        System.out.println("Su numero de retiros son: " + numeroRetiros);
        System.out.println("Su tasa anual es: " + tasaAnual);
        System.out.println("Su comisión mensual es: " + comisionMensual);
    }
}
