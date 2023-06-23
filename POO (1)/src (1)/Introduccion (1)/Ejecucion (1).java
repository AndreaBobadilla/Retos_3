package Introduccion;
// import java.util.Scanner;
public class Ejecucion {
    public static void main(String[] args) {
        /*// Instanciar clase o crear el objeto
        //int añoNaci;
        Scanner capturar = new Scanner (System.in);
        Festividad celebracion=new Festividad();
        // Invocar o llamar un metodo
        celebracion.registrarFestividad();
        // Mostrar valor almacenado
        System.out.println(celebracion.getNombreFestividad());
        // Asignar un valor a un atributo
        celebracion.setNombreFestividad("Navidad");
        // Solicitar al usuario 
        System.out.println("Digite el nombre de la festividad");
        String nombre=capturar.next();
        celebracion.setNombreFestividad(nombre);
        celebracion.mostrarFestividad();
        /*System.out.println("Digite su año de nacimiento: ");
        añoNaci = capturar.nextInt();
        //celebracion.calcularEdad(añoNaci);
    
    capturar.close();*/

    /*Cuadrado c=new Cuadrado();
    c.registrarDatos();
    c.calcularArea();*/
    // Instanciar 
    Carisell juego1= new Carisell();
    // Invocar
    juego1.iniciar();
    juego1.jugar();
    juego1.finalizar();
    }
}
