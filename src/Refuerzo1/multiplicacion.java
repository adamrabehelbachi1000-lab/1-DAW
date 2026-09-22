package Refuerzo1;

import java.util.Scanner;

public class multiplicacion {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int resultado;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el primer numero para hacer la multiplicacion: ");
        numero1 = inputValue.nextInt();

        if (numero1 > 0){
            System.out.println("Introduce el segundo numero para hacer la multiplicación: ");
            numero2 = inputValue.nextInt();
            if (numero2 > 0){
                resultado = numero1 * numero2;
                System.out.println("La multiplicación es " + numero1 + " x " + numero2 + " = " + resultado);
            }else {
                System.out.println("Un numero 0 multiplicado por otro da 0");
            }
        }else {
            System.out.println("Un numero 0 multiplicado por otro da 0");
        }
    }
}
