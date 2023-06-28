package Reto1.Principal;
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
