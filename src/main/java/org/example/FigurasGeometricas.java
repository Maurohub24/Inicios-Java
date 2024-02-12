package org.example;

public class FigurasGeometricas {

    public double radioCirculo;
    public double baseRectangulo;
    public double alturaRectangulo;
    public double ladoCuadrado;
    public double baseTriangulo;
    public double alturaTriangulo;
    public double lado1Triangulo;
    public double lado2Triangulo;
    public double lado3Triangulo;


    public double areaCirculo(){
        double area;
        double pi = 3,1416;
        area = pi * (radioCirculo*radioCirculo);
        return area;
    }
    public double perimetroCirculo(){
        double perimetro;
        double pi = 3,1416;

        perimetro = 2 * (pi * radioCirculo);
        return perimetro;
    }

    public double areaRectangulo(){
        double area;

        area = baseRectangulo * alturaRectangulo;
        return area;
    }

    public double perimetroRectangulo(){
        double perimetro;

        perimetro = 2(baseRectangulo + alturaRectangulo);
        return perimetro;
    }

    public double areaCuadrado(){
        double area;

        area = ladoCuadrado * ladoCuadrado;
        return area;
    }

    public double perimetroCuadrado(){
        double perimetro;

        perimetro = 4*(ladoCuadrado);
        return  perimetro;
    }

    public double areaTriangulo(){
        double area;

        area = (baseTriangulo * alturaTriangulo)/2;
        return  area;
    }

    public double perimetroTriangulo(){
        double perimetro;

        perimetro = lado1Triangulo + lado2Triangulo + lado3Triangulo;
        return perimetro;
    }

    public double hallarHipotenusa(){
        double hypo = 0;
        double cateto1 = 2;
        double cateto2 = 4;

        hypo = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        return hypo;
    }

    public void tipoTriangulo(){
        System.out.println("Introduzca el valor numerico del lado 1:");
        System.out.println("Introduzca el valor numerico del lado 2:");
        System.out.println("Introduzca el valor numerico del lado 3:");

        if(lado1Triangulo==lado2Triangulo && lado2Triangulo==lado3Triangulo){
            System.out.println("El triangulo es equilatero");
        }else {
            if (lado1Triangulo == lado2Triangulo || lado1Triangulo == lado3Triangulo || lado2Triangulo == lado3Triangulo) {
                System.out.println("El triangulo es Isoceles");
            }else {
                if(lado1Triangulo!=lado2Triangulo||lado1Triangulo!=lado3Triangulo||lado2Triangulo!=lado3Triangulo);
                System.out.println("El triangulo es Escaleno");
            }
            }
        }

    }

}
