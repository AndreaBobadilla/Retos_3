package Introduccion;

public class Calculadora {
    // Atributos 
    // Metodos 
    /*public void pedinumeros(){
        double n1, n2;
        Scanner capturar=new Scanner(System.in);
        System.out.println("Digite el primer numero: ");
        n1=capturar.nextInt();
        System.out.println("Digite el segundo numero: ");
        n2=capturar.nextInt();
    capturar.close();
    }*/
    public Calculadora(){

    }

    public double calcularsuma(double n1, double n2){
        double sumar;
        sumar=n1+n2;
        System.out.println("Los numeros son: " + n1 + "," + n2);
        System.out.println("El resultado de la suma es: " + sumar);
    return sumar;
    }

    public double calcularsuma(int n1, int n2){
        double sumar;
        sumar=n1+n2;
        System.out.println("Los numeros son: " + n1 + "," + n2);
        System.out.println("El resultado de la suma es: " + sumar);
    return sumar;
    }


    public double calcularresta(double n1, double n2){
        double restar;
        restar=n1-n2;
        System.out.println("Los numeros son: " + n1 + "," + n2);
        System.out.println("El resultado de la resta es: " + restar);
    return restar;
    }

    public double calcularmultiplicar(double n1, double n2){
        double multiplicar;
        multiplicar=n1*n2;
        System.out.println("Los numeros son: " + n1 + "," + n2);
        System.out.println("El resultado de la multiplicacion es: " + multiplicar);
    return multiplicar;
    }

    public double calculardividir(double n1, double n2){
        double dividir;
        dividir=n1/n2;
        System.out.println("Los numeros son: " + n1 + "," + n2);
        System.out.println("El resultado de la division es: " + dividir);
    return dividir;
    }
}
