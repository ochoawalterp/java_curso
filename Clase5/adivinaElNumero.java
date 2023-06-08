package Clase5;
import java.util.Random;
import java.util.Scanner;
public class adivinaElNumero {
    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 100");
        Integer numero =datos.nextInt();

        Random random = new Random();

        Integer maquina = random.nextInt(100) +1;

        System.out.println("La maquina eligio " + maquina);

        if (numero == maquina){
            System.out.println("Felicidades Ganaste :-)");
        }else {
            System.out.println("Que lastima Perdiste :-(");
        }
    }



}
