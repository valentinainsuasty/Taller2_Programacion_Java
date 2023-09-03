package Taller2_Programacion;
import java.util.Scanner;
public class NumeroPalindromo {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la cantidad de datos: ");
            int cantidadDatos = scanner.nextInt();
            if (cantidadDatos <= 0) {
                System.out.println("La cantidad de datos debe ser mayor que cero.");
                return;
            }
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 1; i <= cantidadDatos; i++) {
                System.out.print("Ingrese el dato #" + i + ": ");
                int dato = scanner.nextInt();
                if (dato < min) {
                    min = dato;
                }

                if (dato > max) {
                    max = dato;
                }
            }

            System.out.println("El rango de los datos ingresados es: " + (max - min));
        }

    }
