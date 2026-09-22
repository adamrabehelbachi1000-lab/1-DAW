import java.util.Scanner;

public class FACTORIAL {
    public static void main(String[] args) {
        int numero;
        int factorial = 1;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el numero para calcular su factorial: ");
        numero = inputValue.nextInt();

        for (int i = numero; i >= 1; i--){
          factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
