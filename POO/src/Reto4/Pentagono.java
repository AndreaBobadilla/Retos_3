package Reto4;
 
import java.util.Scanner;

public class Pentagono extends Figura {

    //Atributos 
    private double perimetro;
    private double apotema;

    //Método constructor vacío
    public Pentagono() {
    }
    //Método constructor con parámetros 
    public Pentagono(double perimetro, double apotema) {
        this.perimetro = perimetro;
        this.apotema = apotema;
    }

    //Métodos accesores get y set
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public double getApotema() {
        return apotema;
    }
    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    // Metodos abstractos
    public void pedirDatos(){
        Scanner capturar = new Scanner(System.in);
        System.out.println("Ingrese el perimetro del pentagono");
        perimetro=capturar.nextDouble();
        System.out.println("Ingrese la apotema del pentagono");
        apotema=capturar.nextDouble();
    capturar.close();
    }

    // Hallar area
    public void calcularArea(){
        double area;
        area=(perimetro*apotema)/2;
        System.out.println("El area del Pentagono es: " + area);
    }
    
    

    
}
