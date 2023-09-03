package Taller2_Programacion;
import java.util.Scanner;
public class Histograma {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int pos = 0;
            int neg = 0;
            System.out.println("Ingrese valores enteros:");
            while (true) {
                int valor = sc.nextInt();
                if (valor == 0) {
                    break;
                } else if (valor > 0) {
                    pos++;
                } else {
                    neg++;
                }
            }
            System.out.println("Positivos: ");
            Asterisco(pos);
            System.out.println("Negativos: ");
            Asterisco(neg);
        }
        public static void Asterisco(int cantidad) {
            for (int i = 0; i < cantidad; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
