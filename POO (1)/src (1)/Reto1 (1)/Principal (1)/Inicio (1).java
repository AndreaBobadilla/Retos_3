package Reto1.Principal;
// creamos paquete reto 1 dentro otro llamado principal
import Reto1.Salud.Persona;
// creamos clase inicio
// para ejecutar
public class Inicio {
    public static void main(String[] args) {
        // Instanciar objeto
        Persona datos=new Persona();
        // Invocar datos
        datos.pedirDatos();
        datos.mostrarPersona();
        datos.calcularImc();
        datos.mayorEdad();
    }
}
