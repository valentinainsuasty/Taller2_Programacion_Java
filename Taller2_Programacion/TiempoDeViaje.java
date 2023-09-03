package Taller2_Programacion;
import java.util.Scanner;
public class TiempoDeViaje {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tTotal = 0;

    while (true) {
        System.out.print("Ingrese el tiempo de viaje: ");
        int tTramo = sc.nextInt();

        if (tTramo == 0) {
            break;
        }

        tTotal += tTramo;
    }

    int horas = tTotal / 60;
    int min = tTotal % 60;

    System.out.println("Tiempo total de viaje: " + horas + ":" + min + " horas");

        }
    }

