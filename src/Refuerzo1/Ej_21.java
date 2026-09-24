package Refuerzo1;

import java.util.Scanner;

public class Ej_21 {
    public static void main(String[] args) {
      double micras;
      double altura;
      int dobleces = 0;
      Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el grosor del papel medido en micras (1 micra = 10-6 metros): ");
        micras = inputValue.nextInt();
        System.out.println("Introduce la altura del edificio (m): ");
        altura = inputValue.nextInt();

        micras = micras * 1e-6;
        
        do {
            micras  = micras * 2;
            dobleces = dobleces + 1;
        }while (micras < altura);
        System.out.println("Se necesitan " + dobleces );
    }
}
