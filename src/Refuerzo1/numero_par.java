package Refuerzo1;

import java.util.Scanner;

public class numero_par {
    public static void main(String[] args) {
        int numero;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un numero para saber si es par o no: ");
        numero = inputValue.nextInt();

        if (numero % 2 == 0){
            System.out.println("Numero par");
        }else {
            System.out.println("Numero impar");
        }
    }
}
