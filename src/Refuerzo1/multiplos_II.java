package Refuerzo1;

import java.util.Scanner;

public class multiplos_II {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un numero para saber si es multiplo de 10: ");
        numero1 = inputValue.nextInt();

        if (numero1 % 10 == 0){
            System.out.println("El numero que has introducido es multiplo de 10");
            System.out.println("Introduce otro numero para saber si es multiplo de 10: ");
            numero2 = inputValue.nextInt();
            if (numero2 % 10 == 0){
                System.out.println("Este numero tambien es multiplo de 10");
            }else {
                System.out.println("No es multiplo de 10");
            }
        }else {
            System.out.println("No es multiplo de 10");
        }


    }
}
