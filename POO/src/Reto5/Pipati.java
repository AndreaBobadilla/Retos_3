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
        System.out.println(nom + " Elija una opción:  1 Piedra, 2 Papel, 3 Tijera");
        jugador = capturar.nextInt();
    capturar.close();
    }

    public void finalizar(){
        if (jugador == 1) {
            if (progra == 0) {
                System.out.println("Jugador: Piedra, Programa: Piedra, ¡Hubo empate!");
 
            }else if (jugador == 1) {
                System.out.println("Jugador: Piedra, Programa: Papel, ¡Has perdido!");
            }else {
                System.out.println("Jugador: Piedra, Programa: Tijera, ¡Has ganado!");
            }
        }else if (jugador == 2) {
            if (progra == 0) {
                System.out.println("Jugador: Papel, Programa: Piedra, !Has ganado!");
 
            }else if (progra == 1) {
                System.out.println("Jugador: Papel, Programa: Papel, !Hubo empate!");
            }else {
                System.out.println("Jugador: Papel, Programa: Tijera , !Has perdido!");
            }
 
        }else if (jugador == 3) {
            if (progra == 0) {
                System.out.println("Jugador: Tijera, Programa: Piedra, !Has perdido!");
 
            }else if (progra == 1) {
                System.out.println("Jugador: Tijera, Programa: Papel, !Has ganado!");
            }else {
                System.out.println("Jugador: Tijera, Programa: Tijera, !Hubo empate!");
            }
        }else {
            System.out.println("Opcion invalida");
        }
    }
}

