package Clase5;
import java.util.Scanner;
public class conversprMillasKm {
    public static void main(String[] args) {

        Scanner cargaDeDatos = new Scanner(System.in);
        System.out.println("Ingresa las Millas ");

        double millas = cargaDeDatos.nextDouble();

        double kilometros = millas  * 1.60934;
        System.out.println("La conversion es " + kilometros + " Kilometros");
    }




}
