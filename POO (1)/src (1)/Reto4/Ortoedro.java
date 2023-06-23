package Reto4;

import java.util.Scanner;

public class Ortoedro extends Figura {
    //Atributos 
    private double profundidad;
    private double altura;
    private double longitud;

    //Método constructor vacío
    public Ortoedro() {
    }
    // Metodo parametros
    public Ortoedro(double profundidad, double altura, double longitud) {
        this.profundidad = profundidad;
        this.altura = altura;
        this.longitud = longitud;
    }

    // get y set
    public double getProfundidad() {
        return profundidad;
    }
    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    // Metodos abstractos
    public void pedirDatosDatos(){
        Scanner capturar = new Scanner(System.in);
        System.out.println("Ingrese la profundidad del ortoedro");
        profundidad=capturar.nextDouble();
        System.out.println("Ingrese la altura del ortoedro");
        altura=capturar.nextDouble();
        System.out.println("Ingrese la longitud del ortoedro");
        longitud=capturar.nextDouble();
    capturar.close();
    }

    // Hallar area
    public void calcularArea(){
        double area;
        area=(profundidad*altura*longitud)/2;
        System.out.println("El area del Octagono es: " + area);
    
}
}
