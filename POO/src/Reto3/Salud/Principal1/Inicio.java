package Reto3.Salud.Principal1;

import Reto3.Salud.Empleado;

public class Inicio {
    public static void main(String[] args) {
        // Instanciar 
        Empleado datos=new Empleado();
        // Invocar 
        datos.pedirDatos();
        datos.traerDatos();
        datos.calcularHonorarios();
        datos.mostraEmple();
    }
    
}
