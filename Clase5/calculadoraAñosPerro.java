package Clase5;
import java.util.Scanner;
public class calculadoraAñosPerro {
    public static void main(String[] args) {
        Scanner  cargaDeDatos = new Scanner(System.in);

        System.out.println("Ingresa tu edad ");

        Integer edad = cargaDeDatos.nextInt();

        Integer edadPerro = edad * 7 ;

        System.out.println("Tu edad es " + edadPerro);
    }
}
