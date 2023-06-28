package Introduccion;
import java.util.Scanner;
public class Ejecucion2 {
    public static void main(String[] args) {
        int n1, n2;
        Calculadora oper=new Calculadora();
        Scanner capturar=new Scanner(System.in);
        System.out.println("Digite el primer numero: ");
        n1=capturar.nextInt();
        System.out.println("Digite el segundo numero: ");
        n2=capturar.nextInt();
        oper.calcularsuma(n1, n2);
        oper.calcularsuma(n1, n2);
        oper.calcularresta(n1, n2);
        oper.calcularmultiplicar(n1, n2);
        oper.calculardividir(n1, n2);

    capturar.close();
    }
}
