package Introduccion;
import java.util.Scanner;
public class Religiosa extends Festividad{
    // Atributos 
    private String nombreReligion;
    // Metodo constructor vacio 
    public Religiosa(){

    }
    // Metodo constructor con parametros
    public Religiosa(int idFestividad, String nombreFestividad, int diaFestividad, String mesFestividad, String paisFestividad, String nombreReligion) {
        super(idFestividad, nombreFestividad, diaFestividad, mesFestividad, paisFestividad);
        this.nombreReligion = nombreReligion;
    }
    
    // Metodos accesores get y set
    public String getNombreReligion() {
        return nombreReligion;
    }
    public void setNombreReligion(String nombreReligion) {
        this.nombreReligion = nombreReligion;
    }

    // Metodos propios
    public void registrarReligion(){
        Scanner capturar=new Scanner (System.in);
        System.out.println("Digite el nombre de la religion de la festividad: ");
        nombreReligion=capturar.next();
    capturar.close();
    }

    public void mostrarReligion(){
        System.out.println("El nombre de la religion es: " + nombreReligion);
    }

    
    

    
}
