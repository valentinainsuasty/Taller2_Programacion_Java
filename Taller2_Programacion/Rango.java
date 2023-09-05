package Taller2_Programacion;
import java.util.Scanner;
public class Rango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos valores ingresará? ");
        int cDatos = sc.nextInt();

        double min = Double.MAX_VALUE; // Inicializa min con el valor más grande posible
        double max = Double.MIN_VALUE; // Inicializa max con el valor más pequeño posible

        for (int i = 1; i <= cDatos; i++) {
            System.out.print("Valor " + i + ": ");
            double dato = sc.nextDouble();

            if (dato < min) {
                min = dato;
            }
            if (dato > max) {
                max = dato;
            }
        }

        double rang = max - min;
        System.out.println("El rango de los datos ingresados es: " + rang);

    }
}


