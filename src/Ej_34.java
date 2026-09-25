import java.util.Scanner;

public class Ej_34 {
    public static void main(String[] args) {
        int numero1; int numero2; int resultado = 0;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        numero1 = inputValue.nextInt();
        System.out.println("Introduce el segundo numero: ");
        numero2 = inputValue.nextInt();

        for (int i = 1; i <= numero2; i++) {
            System.out.print(numero1);
            resultado = resultado + numero1;
            if (i < numero2) {
                System.out.print("+");
            }
        }
        System.out.print("=" + resultado);
        System.out.println("\nMultiplicación con el metodo de sumas sucesivas");
    }
}
