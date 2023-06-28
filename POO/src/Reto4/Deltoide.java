package Reto4;

import java.util.Scanner;

public class Deltoide extends Figura {

    //Atributos 
    private double diago1;
    private double diago2;

    //Método constructor vacío
    public Deltoide() {
    }

    // Metodo parametros

    public Deltoide(double diago1, double diago2) {
        this.diago1 = diago1;
        this.diago2 = diago2;
    }
    // get y set

    public double getDiago1() {
        return diago1;
    }

    public void setDiago1(double diago1) {
        this.diago1 = diago1;
    }

    public double getDiago2() {
        return diago2;
    }

    public void setDiago2(double diago2) {
        this.diago2 = diago2;
    }

    // Metodos abstractos
    public void pedirDatos(){
        Scanner capturar = new Scanner(System.in);
        System.out.println("Ingrese la diagonal 1 del deltoide");
        diago1=capturar.nextDouble();
        System.out.println("Ingrese la diagonal 2 del deltoide");
        diago2=capturar.nextDouble();
    capturar.close();
    }

    // Hallar area
    public void calcularArea(){
        double area;
        area=(diago1*diago2)/2;
        System.out.println("El area del Deltoide es: " + area);
    }
    
    
    
}
