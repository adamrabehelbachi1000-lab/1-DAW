package Refuerzo1;

import java.util.Scanner;

public class multiplos_IIIIII {
    public static void main(String[] args) {
        int numero;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un numero para saber si  NO es multiplo de 2 y de 3: ");
        numero = inputValue.nextInt();

        if (numero % 2 > 0 & numero % 3 > 0){
            System.out.println("No es multiplo de 2 ni de 3");
        }else {
            System.out.println("Es multiplo");
        }
    }
}
