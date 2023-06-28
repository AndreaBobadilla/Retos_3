package Introduccion;
import java.util.Scanner;
public class Carisell implements Juego{
    // atributos 
    private int moneda;
    private String jugador;
    private int eleccion;

    // Metodo constructor vacio
    public Carisell(){

    }
    // Metodo con parametros
    
    public Carisell(int moneda, String jugador, int eleccion) {
        this.moneda = moneda;
        this.jugador = jugador;
        this.eleccion = eleccion;
    }

    Scanner capturar=new Scanner(System.in);
    public void iniciar(){

    }
    public void jugar(){

    }
    public void finalizar(){

    }
    
}
