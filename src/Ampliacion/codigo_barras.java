package Ampliacion;

import java.util.Scanner;

public class codigo_barras {
    public static void main(String[] args) {
        String numero; int resultado = 0;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un numero de 8 o 13 cifras: ");
        numero = inputValue.next();

        if (numero.length() == 8 || numero.length() == 13){
            if (numero.length() == 8){
                for (int i = 6; i >= 0; i--) {
                    if (i % 2 == 0) {
                        resultado += (numero.charAt(i) - '0') * 3;
                    } else {
                        resultado += (numero.charAt(i) - '0');
                    }
                }
                System.out.println(resultado);
            }
            int control = (10 - (resultado % 10) % 10);
            int digito_control = numero.charAt(7) - '0';

            if (digito_control == control){
                System.out.println("El codigo es valido");
            }else {
                System.out.println("El codigo no es valido");
            }
        }
    }
}
