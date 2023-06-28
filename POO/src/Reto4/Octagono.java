package Reto4;

import java.util.Scanner;

public class Octagono extends Figura {
    //Atributos 
    private double perime;
    private double apote;

    //Método constructor vacío
    public Octagono() {
    }
    // Metodo parametros
    public Octagono(double perime, double apote) {
        this.perime = perime;
        this.apote = apote;
    }
    // get y set
    public double getPerime() {
        return perime;
    }
    public void setPerime(double perime) {
        this.perime = perime;
    }
    public double getApote() {
        return apote;
    }
    public void setApote(double apote) {
        this.apote = apote;
    }

    // Metodos abstractos
    public void pedirDatos(){
        Scanner capturar = new Scanner(System.in);
        System.out.println("Ingrese el perimetro del Octagono");
        perime=capturar.nextDouble();
        System.out.println("Ingrese la apotema del Octagono");
        apote=capturar.nextDouble();
    capturar.close();
    }

    // Hallar area
    public void calcularArea(){
        double area;
        area=(perime*apote)/2;
        System.out.println("El area del Octagono es: " + area);
    }
    
    
    
}
