package Refuerzo1;

import java.util.Scanner;

public class Ej_21 {
    public static void main(String[] args) {
      double micras;
      double altura;
      Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el grosor del papel medido en micras (1 micra = 10-6 metros): ");
        micras = inputValue.nextInt();
        System.out.println("Introduce la altura del edificio (m): ");
        altura = inputValue.nextInt();

    }
}
