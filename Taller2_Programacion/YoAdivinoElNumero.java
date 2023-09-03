package Taller2_Programacion;
import java.util.Scanner;
import java.util.Random;
public class YoAdivinoElNumero {
    public static void main(String[] args) {
            Random rm = new Random();
            int numA = rm.nextInt(100)+1;
            Scanner sc = new Scanner(System.in);
            int intn = 0;
            boolean adv = false;
            System.out.println("Adivina el numero.");
            while (!adv) {
                intn++;
                System.out.println("Intento " + intn + ":");
                int numU = sc.nextInt();

                if (numU < numA) {
                    System.out.println("El numero es mayor que " + numU);
                } else if (numU > numA) {
                    System.out.println("El numero es menor que " + numU);
                } else {
                    adv = true;
                    System.out.println("Correcto. Adivinaste en " + intn + " intentos.");
                }
            }

        }
    }
