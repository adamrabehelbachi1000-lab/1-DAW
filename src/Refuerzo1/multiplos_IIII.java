package Refuerzo1;

import java.util.Scanner;

public class multiplos_IIII {
    public static void main(String[] args) {
        int numero;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un numero para saber si es multiplo de 2 y de 3: ");
        numero = inputValue.nextInt();

        if (numero % 2 == 0 & numero % 3 == 0){
            System.out.println("Es multiplo de 2 y de 3");
        }else {
            System.out.println("No es multiplo de 2 ni de 3");
        }
    }
}
