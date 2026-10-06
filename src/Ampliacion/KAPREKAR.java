package Ampliacion;

import java.util.Arrays;
import java.util.Scanner;

public class KAPREKAR {
    public static void main(String[] args) {
        int numero, digito1 = 0, digito2 = 0, digito3 = 0, digito4 = 0, numero_ascendente = 0, numero_descendente = 0, resultado = 0, iteraciones = 0;
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Introduce un numero de 4 cifras: ");
        numero = inputValue.nextInt();

        if (numero >= 1000 && numero <= 9999){
            digito1 = numero/1000;
            digito2 = (numero/100) % 10;
            digito3 = (numero/10) % 10;
            digito4 = numero % 10;
            if (digito1 != digito2 || digito1 != digito3 || digito1 != digito4 || digito2 != digito3 || digito2 != digito4 || digito3 != digito4 || digito1 == 0){

                do {
                    digito1 = numero/1000;
                    digito2 = (numero/100) % 10;
                    digito3 = (numero/10) % 10;
                    digito4 = numero % 10;
                    int[] digitos = {digito1, digito2, digito3, digito4};
                    Arrays.sort(digitos);
                    numero_ascendente = digitos[0] * 1000 + digitos[1] * 100 + digitos[2] * 10 + digitos[3];
                    numero_descendente = digitos[3] * 1000 + digitos[2] * 100 + digitos[1] * 10 + digitos[0];

                    numero = numero_descendente - numero_ascendente;
                    System.out.println(numero_descendente + " - " + numero_ascendente + " = " + numero);
                    iteraciones++;
                }while (numero != 6174 && iteraciones <=7);
                System.out.println("Se necesitan " + iteraciones + " iteraciones");
            }
        }
    }
}
