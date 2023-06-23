package Reto2.Principal;
// En las imagenes del reto 1 esta parte del reto 2
import Reto1.Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona datos=new Persona();
        double pes=datos.solicitarPeso();
        double esta=datos.solicitarEstatura();
        double pesActu=datos.calcularImc(pes, esta);
        if(pesActu<20){
            System.out.println("El peso esta por debajo del ideal");
        }else if(pesActu>=20 && pesActu<=25){
            System.out.println("El peso es ideal");
        }else if(pesActu>25){
            System.out.println("El peso esta por encima del ideal (Sobrepeso)");
        }else{
            System.out.println("Valor invalido");
        }
    }
}

