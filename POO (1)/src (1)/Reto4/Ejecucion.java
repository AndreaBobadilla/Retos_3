package Reto4;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        //Declarar variables
        String figura, respues;
        int figu=0;
        //Instanciar la clase scanner
        Scanner capturar = new Scanner(System.in);
        do{
        //Solicitar al usuario elegir
        System.out.println("Elige una figura:Pentagono, Deltoide, Octagono, Ortoedro");
        figura=capturar.next();

        switch(figura){
            case "Pentagono":
            Pentagono figurr1 = new Pentagono();
            figurr1.pedirDatos();
            figurr1.calcularArea();
            figu++;
            break;

            case "Deltoide":
            Pentagono figurr2 = new Pentagono();
            figurr2.pedirDatos();
            figurr2.calcularArea();
            figu++;
            break;

            case "Octagono":
            Pentagono figurr3 = new Pentagono();
            figurr3.pedirDatos();
            figurr3.calcularArea();
            figu++;
            break;

            case "Ortoedro":
            Pentagono figurr4 = new Pentagono();
            figurr4.pedirDatos();
            figurr4.calcularArea();
            figu++;
            break;

            default:
            System.out.println("Figura Invalida");
        }
        
        System.out.println("Desea hallar el area de otra figura, escriba si o no");
        respues=capturar.next();

    }while(respues.equalsIgnoreCase("si"));

System.out.println("Usted selecciono" + figu + "Vuelva Pronto!!!");
    capturar.close();
    }
}