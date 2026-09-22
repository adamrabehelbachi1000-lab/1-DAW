package Refuerzo1;

import java.util.Scanner;

public class Doble_Triple {
    public static void main(String[] args) {
        int numero;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un numero para calcular su doble y el triple: ");
        numero = inputValue.nextInt();

        System.out.println("El doble de " + numero + " es " + numero * 2 );
        System.out.println("El triple de " + numero + " es " + numero * 3 );

    }
}
