package Introduccion;
import java.util.Scanner;
public class Festividad {
    // Atributos
    // Modificador de acceso Privado
    private int idFestividad;
    private String nombreFestividad;
    private int diaFestividad;
    private String mesFestividad;
    private String paisFestividad;
    // Metodo constructor vacio 
    public Festividad(){  
    }

    // Metodo con parametros 
    public Festividad(int idFestividad, String nombreFestividad, int diaFestividad, String mesFestividad, String paisFestividad) {
        this.idFestividad = idFestividad;
        this.nombreFestividad = nombreFestividad;
        this.diaFestividad = diaFestividad;
        this.mesFestividad = mesFestividad;
        this.paisFestividad = paisFestividad;
    }

    // Metodos accesores get y set
    public int getIdFestividad() {
        return idFestividad;
    }

    public void setIdFestividad(int idFestividad) {
        this.idFestividad = idFestividad;
    }

    public int getDiaFestividad() {
        return diaFestividad;
    }

    public void setDiaFestividad(int diaFestividad) {
        this.diaFestividad = diaFestividad;
    }

    public String getMesFestividad() {
        return mesFestividad;
    }

    public void setMesFestividad(String mesFestividad) {
        this.mesFestividad = mesFestividad;
    }

    public String getPaisFestividad() {
        return paisFestividad;
    }

    public void setPaisFestividad(String paisFestividad) {
        this.paisFestividad = paisFestividad;
    }

    public String getNombreFestividad() {
        return nombreFestividad;
    }

    public void setNombreFestividad(String nombreFestividad) {
        this.nombreFestividad = nombreFestividad;
    }

    // Metodos propios
    public void registrarFestividad(){
        Scanner capturar= new Scanner (System.in);
        System.out.println("Digite el id de la festividad: ");
        idFestividad = capturar.nextInt();
        System.out.println("Digite el nombre de la festividad: ");
        nombreFestividad = capturar.next();
        System.out.println("Digite el dia de la festividad: ");
        diaFestividad = capturar.nextInt();
        System.out.println("Digite el mes de la festividad: ");
        mesFestividad = capturar.next();
        System.out.println("Digite el pais de la festividad: ");
        paisFestividad = capturar.next();
    capturar.close();
    }

    public void mostrarFestividad(){
        System.out.println("Los datos de la festividad son: " + idFestividad + " , " + nombreFestividad + " , " + diaFestividad + " , " + mesFestividad + "," + paisFestividad + ".");
    }

    /*public void calcularEdad(int añoNaci){
        int añoActu, edad;
        Scanner capturar = new Scanner (System.in);
        System.out.println("Digite el año actual: ");
        añoActu = capturar.nextInt();
        edad = añoActu - añoNaci;
        System.out.println("Su edad es: " + edad);*/
    
    }
    

