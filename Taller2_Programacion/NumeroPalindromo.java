package Taller2_Programacion;
import java.util.Scanner;
public class NumeroPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num1 = sc.nextInt();

        if (Palindromo(num1)) {
            System.out.println(num1 + " es un numero palindromo.");
        } else {
            System.out.println(num1 + " no es un numero palindromo.");
        }

    }

    public static boolean Palindromo(int num) {
        int numA = num;
        int numR = 0;

        while (num > 0) {
            int dig = num % 10;
            numR = numR * 10 + dig;
            num /= 10;
        }

        return numA == numR;
    }
}