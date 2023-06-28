package Introduccion;
import java.util.Scanner;
public class Cuadrado extends Figura {
    private int lado;
    public Cuadrado(){}
    public Cuadrado (int lado){
    super();
    this.lado=lado;
    
    }
    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }

    public void registrarDatos(){
        Scanner capturar=new Scanner (System.in);
        System.out.println("Ingrese el valor del lado: ");
        lado=capturar.nextInt();
    capturar.close();
    }

    public void calcularArea(){
        float area=lado*lado;
        System.out.println("El lado del cuadrado es: " + lado + " el area es: " + area);
    }

    public void calcularPerimetro(){
    }

    
}
