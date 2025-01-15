package Actividades;

import java.util.*;

public class Actividad5 {

    public static double calcularMedia(int[] numeros, boolean positivos) {
        int suma = 0, contador = 0;

        for (int numero : numeros) {
            if ((positivos && numero > 0) || (!positivos && numero < 0)) {
                suma += numero;
                contador++;
            }
        }

        return contador > 0 ? (double) suma / contador : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de números (n): ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        int contCero = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Introduzca el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            if (numeros[i] == 0) {
                contCero++;
            }
        }

        System.out.println("La media de números positivos introducidos es: " + calcularMedia(numeros, true));
        System.out.println("La media de números negativos introducidos es: " + calcularMedia(numeros, false));
        System.out.println("La cantidad de números 0 introducidos es: " + contCero);

        sc.close();
    }
}
