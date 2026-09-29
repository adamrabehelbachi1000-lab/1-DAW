import java.util.Scanner;

public class Ej_37 {
    public static void main(String[] args) {
        String numero;
        int suma_numeros = 0;
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Introduce un numero binario para pasarlo a decimal: ");
        numero = inputValue.next();

            if (numero.length() >= 1 && numero.charAt(numero.length() - 1) == '1') {
                suma_numeros = suma_numeros + 1;
            }if (numero.length() >= 2 && numero.charAt(numero.length() - 2) == '1') {
                suma_numeros = suma_numeros + 2;
            }if (numero.length() >= 3 && numero.charAt(numero.length() - 3) == '1') {
                suma_numeros = suma_numeros + 4;
            }if (numero.length() >= 4 && numero.charAt(numero.length() - 4) == '1') {
                suma_numeros = suma_numeros + 8;
            }if (numero.length() >= 5 && numero.charAt(numero.length() - 5) == '1') {
                suma_numeros = suma_numeros + 16;
            }if (numero.length() >= 6 && numero.charAt(numero.length() - 6) == '1') {
                suma_numeros = suma_numeros + 32;
            }if (numero.length() >= 7 && numero.charAt(numero.length() - 7) == '1') {
                suma_numeros = suma_numeros + 64;
            }if (numero.length() >= 8 && numero.charAt(numero.length() - 8) == '1') {
                suma_numeros = suma_numeros + 128;
            }
        System.out.println("decimal: " + suma_numeros);
    }
}
