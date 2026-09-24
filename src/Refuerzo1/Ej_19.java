package Refuerzo1;

import java.util.Scanner;

public class Ej_19 {
    public static void main(String[] args) {
        int metros; int velocidad; double tiempo;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce cuantos metros has recorrido (m): ");
        metros = inputValue.nextInt();
        System.out.println("Introduce a que velocidad maxima permitida(km/h):  ");
        velocidad = inputValue.nextInt();
        System.out.println("Introduce el tiempo tardado (s): ");
        tiempo = inputValue.nextInt();

        metros = metros/1000;
        int kilometros = metros;
        double velocidad_media = kilometros/(tiempo/3600);


        if (velocidad_media >= (velocidad)){
            if (velocidad_media < velocidad * 1.20){
                System.out.println("MULTA");
            }else {
                System.out.println("PUNTOS");
            }
        }else {
            System.out.println("OK");
        }
    }
}

