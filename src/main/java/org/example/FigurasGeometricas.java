package org.example;

public class FigurasGeometricas {

    double radioCirculo;
    double baseRectangulo;
    double alturaRectangulo;
    double ladoCuadrado;
    double baseTriangulo;
    double alturaTriangulo;
    double lado1Triangulo;
    double lado2Triangulo;
    double lado3Triangulo;


    public double areaCirculo(){
        double area;
        double pi = 3,1416;

        area = pi * (radioCirculo*radioCirculo);
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


}
