package Clase5;
import  java.util.Scanner;
public class calculadoraPropinas {
    public static void main(String[] args) {


        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Ingresa el valr de la cuenta ");
        double cuenta = cargaDeDatos.nextDouble();

        System.out.println("Ingresa el porcentaje de propina que deseas dejar ");
        double propina = cargaDeDatos.nextDouble();

        double totalPropina = cuenta*(propina/100);

        System.out.println("El total de la propia es " + totalPropina);
    }
}