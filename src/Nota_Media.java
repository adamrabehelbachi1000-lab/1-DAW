import java.util.Scanner;

public class Nota_Media {
    public static void main(String[] args) {
        double notas;
        double media = 0;
        int numero_notas = 0;
        double suma_notas = 0;
        Scanner inputValue = new Scanner(System.in);

        do {
            System.out.println("Introduce una nota, para finalizar y calcular la media de las notas, escriba -1: ");
            notas = inputValue.nextInt();
            if (notas != -1) {
                numero_notas = numero_notas + 1;
                suma_notas = suma_notas + notas;
            }
        }while (notas != -1);
        media = suma_notas/numero_notas;
        System.out.println("La media de las notas es: " + media);
    }
}
