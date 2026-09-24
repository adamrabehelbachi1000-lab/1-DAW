package Refuerzo1;

import java.util.Scanner;

public class ej_18 {
    public static void main(String[] args) {
        int numero;
        int cinco_pares = 0;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un numero para saber los 5 siguientes numero pares a partir de el: ");
        numero = inputValue.nextInt();

        do {
            numero= numero + 1;
            if (numero % 2 == 0){
                System.out.println(numero);
                cinco_pares = cinco_pares + 1;
            }
        }while (cinco_pares < 5);
    }
}
