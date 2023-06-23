package Reto5;

import java.util.Random;
import java.util.Scanner;

public class Pipati implements Juego{
     //Atributos
    private int jugador;
    private int progra;
    private String nom;

    //Método constructor vacío
    public Pipati(){

    }
    //Método constructor con parámetros
     public Pipati(int jugador, int progra, String nom) {
        this.jugador = jugador;
        this.progra = progra;
        this.nom = nom;
    }

    public void iniciar(){
        Scanner capturar = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nom=capturar.next();
    capturar.close();
    }

    public void jugar(){
        Scanner capturar = new Scanner(System.in);
        //Instanciamos el método random para generar los números
        Random elegi = new Random();
        progra = elegi.nextInt(3);
        System.out.println(nom + " Elija una opción: Piedra, Papel, Tijera");
        jugador = capturar.nextInt();
    capturar.close();
    }

    public void finalizar(){
        if (jugador == 1) {
             if (progra == 0) {
                 System.out.println("El jugador saco: \nPiedra \nEl programa saco: \nPiedra \n¡EMPATE!");
 
             } else if (jugador == 1) {
                 System.out.println("El jugador saco: \nPiedra \nEl programa saco: \nPapel \n¡PERDISTE");
             } else {
                 System.out.println("El jugador saco: \nPiedra \nEl programa saco: \nTijera \n¡GANASTE!");
             }
         } else if (jugador == 2) {
             if (progra == 0) {
                 System.out.println("El jugador saco: \nPapel \nEl programa saco: \nPiedra \n¡GANASTE!");
 
             } else if (progra == 1) {
                 System.out.println("El jugador saco: \nPapel \nEl programa saco: \nPapel \n¡EMPATE!");
             } else {
                 System.out.println("El jugador saco: \nPapel \nEl programa saco: \nTijera \n¡PERDISTE!");
             }
 
         } else if (jugador == 3) {
             if (progra == 0) {
                 System.out.println("El jugador saco: \nTijera \nEl programa saco: \nPiedra \n¡PERDISTE!");
 
             } else if (progra == 1) {
                 System.out.println("El jugador saco: \nTijera \nEl programa saco: \nPapel \n¡GANASTE!");
             } else {
                 System.out.println("El jugador saco: \nTijera \nEl programa saco: \nTijera \n¡EMPATE!");
             }
         } else {
             System.out.println("Opcion invalida");
         }
    }
}

