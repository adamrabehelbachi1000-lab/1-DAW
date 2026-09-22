package Refuerzo1;

import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        double numero1;
        double numero2;
        double resultado;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el primer numero para dividir: ");
        numero1 = inputValue.nextDouble();
        System.out.println("Introduce el segundo numero para dividir: ");
        numero2 = inputValue.nextDouble();

        if (numero2 > 0){
            resultado = numero1/numero2;
            System.out.println("La siguiente división " + numero1 + "/" + numero2 + " da el siguiente resultado " + resultado);
        }else {
            System.out.println("No se puede dividir entre 0");
        }
    }
}
