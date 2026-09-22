package Refuerzo1;

import java.util.Scanner;

public class pares_III {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        numero1 = inputValue.nextInt();
        System.out.println("Introduce el segundo numero para saber si uno es par y el otro no: ");
        numero2 = inputValue.nextInt();

        if (numero1 % 2 == 0 & numero2 > 0 || numero2 == 0 & numero1 > 0){
            System.out.println("Un numero es par y el otro no");
        }else {
            System.out.println("Ambos son pares o impares");
        }
    }
}
