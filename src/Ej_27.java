import java.util.Scanner;

public class Ej_27 {
    public static void main(String[] args) {
        int numero;
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Introduce un número numero para hacer su impresión: ");
        numero = inputValue.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
