package Refuerzo1;

import java.util.Scanner;

public class Ej_15 {
    public static void main(String[] args) {
        int t;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce una cifra en segundos: ");
        t = inputValue.nextInt();

        int horas = t / 3600;
        int minutos = (t % 3600) / 60;
        int segundos = t % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}
