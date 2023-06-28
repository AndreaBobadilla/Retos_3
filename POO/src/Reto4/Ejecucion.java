package Reto4;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        //Declarar variables
        String figura;
        int respues;
        //Instanciar la clase scanner
        Scanner capturar = new Scanner(System.in);
do{
        System.out.println("Elige una figura: Pentagono, Deltoide, Octagono, Ortoedro");
        figura=capturar.next();

        switch(figura){
            case "Pentagono":
            Pentagono figurr1 = new Pentagono();
            figurr1.pedirDatos();
            figurr1.calcularArea();
            break;

            case "Deltoide":
            Deltoide figurr2 = new Deltoide();
            figurr2.pedirDatos();
            figurr2.calcularArea();
            break;

            case "Octagono":
            Octagono figurr3 = new Octagono();
            figurr3.pedirDatos();
            figurr3.calcularArea();
            break;

            case "Ortoedro":
            Ortoedro figurr4 = new Ortoedro();
            figurr4.pedirDatos();
            figurr4.calcularArea();
            break;

            default:
            System.out.println("Figura Invalida");
        }
        
        System.out.println("Desea hallar el area de otra figura?: 1 Si 2 No");
        respues=capturar.nextInt();

}while(respues==1);
System.out.println("Vuelva Pronto!!!");
capturar.close();
}
}