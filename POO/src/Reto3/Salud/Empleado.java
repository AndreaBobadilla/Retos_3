package Reto3.Salud;
import java.util.Scanner;
import Reto1.Salud.Persona;
public class Empleado extends Persona{
    // Atributos 
    private String cargo;
    private double valorHora; 
    private int horasTrabajadas; 
    private String departamento;

    // Metodo vacio
    public Empleado(){

    }
    // Metodo con parametros
    public Empleado(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura, int edad, String sexo, String cargo, double valorHora, int horasTrabajadas, String departamento) {
        super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }
    // Metodos accesores get y set
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Metodos propios
    public void traerDatos(){
        Scanner capturar=new Scanner(System.in);
        System.out.println("Ingrese su cargo: ");
        cargo=capturar.next();
        System.out.println("Ingrese el valor por hora: ");
        valorHora=capturar.nextDouble();
        System.out.println("Ingrese las horas trabajadas: ");
        horasTrabajadas=capturar.nextInt();
        System.out.println("Ingrese el departamento: ");
    capturar.close();
    }

    public void calcularHonorarios(){
        double reteica;
        double totalapagar;
        reteica=(valorHora*horasTrabajadas*0.996)/100;
        totalapagar=(valorHora*horasTrabajadas-reteica);
        System.out.println("El total a pagar es: " + totalapagar);
    }
    public void mostraEmple(){
        System.out.println("Los datos del empleado son: " + "\n" + "Tipo de documento: " + getTipoDoc() + "\n" + "Numero de documento: " + getDocumento() + "\n"
        + "Nombre: " + getNombre() + "\n" + "Apellido: " + getApellido() + "\n" + "Cargo: " + cargo + "\n" + "Horas Trabajadas: " + horasTrabajadas + "\n"
        + "Valor por hora: " + valorHora + "\n");
    }
    

    
}
