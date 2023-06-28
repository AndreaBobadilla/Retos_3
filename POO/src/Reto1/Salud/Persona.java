package Reto1.Salud;
import java.util.Scanner;
public class Persona {
    // Atributos -> los creamos
    // Modificador de acceso Privado
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;

    // Metodo constructor vacio 
    public Persona(){  
    }

    // Metodos con parametros
    public Persona(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura, int edad, String sexo) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // Metodos propios
    public void pedirDatos(){
        Scanner capturar= new Scanner (System.in);
        System.out.println("Ingrese su tipo de documento en siglas: ");
        tipoDoc = capturar.next();
        System.out.println("Ingrese el numero de su documento sin puntos: ");
        documento = capturar.nextInt();
        System.out.println("Ingrese su nombre: ");
        nombre = capturar.next();
        System.out.println("Ingrese su apellido: ");
        apellido = capturar.next();
        System.out.println("Ingrese su peso en Kg: ");
        peso = capturar.nextDouble();
        System.out.println("Ingrese su estatura en m: ");
        estatura = capturar.nextDouble();
        System.out.println("Ingrese su edad: ");
        edad = capturar.nextInt();
        System.out.println("Ingrese su sexo (Fememnino o Masculino): ");
        sexo = capturar.next();
    
    capturar.close();
    }

    public void mostrarPersona(){
        System.out.println("\n" + "Los datos de la persona son: " + "\n" + tipoDoc + "\n" + documento + "\n" + nombre + "\n" + apellido + "\n" + peso + "\n" + estatura + "\n" + edad + "\n" + sexo);
    }

    // Reto 1
    public void calcularImc(){
        double pesoActual;
        pesoActual=peso/(Math.pow(estatura, 2));
        System.out.println("Su peso actual es: " + pesoActual);

        if(pesoActual<20){
            System.out.println("El peso esta por debajo del ideal");
        }else if(pesoActual>=20 && pesoActual<=25){
            System.out.println("El peso es ideal");
        }else if(pesoActual>25){
            System.out.println("El peso esta por encima del ideal (Sobrepeso)");
        }else{
            System.out.println("Valor invalido");
        }

    }

    // Reto 2
    public double solicitarPeso () {
        Scanner capturar = new Scanner(System.in);
        double peso;
        System.out.println("Ingrese su peso: ");
        peso=capturar.nextDouble();
        return peso;
    }

    public double solicitarEstatura () {
        Scanner capturar = new Scanner(System.in);
        double estatura;
        System.out.println("Ingrese su estatura: ");
        estatura=capturar.nextDouble();
        return estatura;
    }
    public double calcularImc(double peso, double estatura){
        double pesoActual;
        pesoActual=peso/(Math.pow(estatura, 2));
        System.out.println("Su peso actual es: " + pesoActual);
        return pesoActual;
    }


    public void mayorEdad(){
        if(edad>=18){
            System.out.println("Usted es Mayor de edad");
        }else if(edad<18){
            System.out.println("Usted es Menor de edad");
        }else{
            System.out.println("Valor invalido");
        }
    }
}
