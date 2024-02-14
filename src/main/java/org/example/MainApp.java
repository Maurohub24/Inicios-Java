package org.example;

import java.util.ArrayList;

public class MainApp {

    public static void main (String[] args){

    CuentasBancarias cuenta1 = new CuentasBancarias(10,2);

      cuenta1.calcularConsignarDinero(50);
      cuenta1.calcularRetirarDinero(5);
      cuenta1.calcularInteresMensual(2);
      cuenta1.imprimirCuentas();

    }
}
