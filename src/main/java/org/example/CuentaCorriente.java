package org.example;

public class abstract CuentaCorriente extends CuentasBancarias {

    float sobregiro = 0;

    public abstract CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }


    public abstract retirarDinero(float retiro) {
        if (sobregiro) {
            super.calcularRetirarDinero(retiro);
        }
    }

}
