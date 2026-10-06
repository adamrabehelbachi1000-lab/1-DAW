package Ampliacion;

import java.util.Scanner;

public class numero_amstrong {
    public static void main(String[] args) {
        int numero, digito1 = 0, digito2 = 0, digito3 = 0, suma_total = 0;
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Inreoduce un numero de 3 cifras: ");
        numero = inputValue.nextInt();

        if (numero >= 100 && numero < 1000){
            digito1 = numero / 100;
            digito1 = digito1 * digito1 * digito1;

            digito2 = (numero / 10) % 10;
            digito2 = digito2 * digito2 * digito2;

            digito3 = numero % 10;
            digito3 = digito3 * digito3 * digito3;

            suma_total = digito1 + digito2 + digito3;
            if (suma_total == numero){
                System.out.println("El numero introducido es un numero amstrong");
            }else {
                System.out.println("El numero introducido no es un numero amstrong");
            }
        }else {
            System.out.println("No has introducido un numero de 3 cifras");
        }
    }
}
