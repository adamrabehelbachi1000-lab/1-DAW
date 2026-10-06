package Ampliacion;

import java.util.Scanner;

public class lucky_number {
    public static void main(String[] args) {
        String dia;String mes;String año;int suma_años = 0;int suma_meses = 0;int suma_dias = 0;String suma_total_str;int suma_total_int = 0;int lucky_number = 0;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce tu dia de nacimiento: ");
        dia = inputValue.next();
        System.out.println("Introduce tu mes de nacimiento: ");
        mes = inputValue.next();
        System.out.println("Introduce tu año de nacimiento: ");
        año = inputValue.next();

        for (int i = 0; i < dia.length(); i++) {
            System.out.print(dia.charAt(i));
            if (i < dia.length() ) {
                System.out.print("+");
            }
            suma_dias = suma_dias + dia.charAt(i) - '0';
        }
        for (int i = 0; i < mes.length(); i++) {
            System.out.print(mes.charAt(i));
            if (i < mes.length() ) {
                System.out.print("+");
            }
            suma_meses = suma_meses + mes.charAt(i) - '0';
        }
        for (int i = 0; i < año.length(); i++) {
            System.out.print(año.charAt(i));
            if (i < año.length() - 1) {
                System.out.print("+");
            }
            suma_años = suma_años + año.charAt(i) - '0';
        }
        suma_total_int = suma_años + suma_dias + suma_meses;
        System.out.print("="  + suma_total_int +  " es la suma de los digitos de tu fecha de nacimiento");
        System.out.println("");
        suma_total_str = String.valueOf(suma_total_int);

        for (int i = 0; i < suma_total_str.length(); i++) {
            System.out.print(suma_total_str.charAt(i));
            if (i < suma_total_str.length() - 1) {
                System.out.print("+");
            }
            lucky_number = lucky_number + suma_total_str.charAt(i) - '0';
        }
        System.out.println("=" + lucky_number);
        System.out.println("Tu lucky number es: " + lucky_number);
    }
}