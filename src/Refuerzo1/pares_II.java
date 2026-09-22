package Refuerzo1;

import java.util.Scanner;

public class pares_II {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        numero1 = inputValue.nextInt();
        System.out.println("Introduce el segundo numero para saber si alguno de los dos es par: ");
        numero2 = inputValue.nextInt();

        if (numero1 % 2 == 0 || numero2 % 2 == 0){
            System.out.println("Uno de los dos es par");
        }else {
            System.out.println("Ambos numeros no son pares");
        }
    }
}
