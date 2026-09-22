package Refuerzo1;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        numero1 = inputValue.nextInt();
        System.out.println("Introduce el segundo numero: ");
        numero2 = inputValue.nextInt();

        if (numero1 % numero2 == 0){
            System.out.println("El primer numero es multiplo del segundo");
        }else {
            System.out.println("El primer numero no es multiplo del segundo");
        }
    }
}
