package Reto3.Salud;
import java.util.Scanner;
public class Persona1 {
    // Atributos
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;

    // Metodo constructor vacio 
    public Persona1(){  
    }
    // Metodo constructor con parametros 
    public Persona1(String tipoDoc, int documento, String nombre, String apellido) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Metodos accesores get y set
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Metodos Propios
    public void solicitarDatos(){
        Scanner capturar=new Scanner(System.in);
        System.out.println("Ingrese su tipo de documento en siglas: ");
        tipoDoc=capturar.next();
        System.out.println("Ingrese su numero de documento sin puntos: ");
        documento=capturar.nextInt();
        System.out.println("Ingrese su nombre: ");
        nombre=capturar.next();
        System.out.println("Ingrese su apellido: ");
        apellido=capturar.next();
    
    capturar.close();
    }

    
    
}
