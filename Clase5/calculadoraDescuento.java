package Clase5;
import java.util.Scanner;

public class calculadoraDescuento {
    public static void main(String[] args) {

        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Ingrese el precio Original");
        double precioProducto  = cargaDeDatos.nextDouble();

        System.out.println("Ingresa el porcentaje de descuento");
        double porcentajeDescuento = cargaDeDatos.nextDouble();


        double precioFinal = precioProducto - (precioProducto * porcentajeDescuento/100);

        System.out.println("El precio es " + precioFinal);

    }
}
