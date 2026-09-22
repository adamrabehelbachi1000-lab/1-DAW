import java.util.Scanner;

public class impresion_numeros {
    public static void main(String[] args) {
        int numero;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un numero para hacer su impresión: ");
        numero = inputValue.nextInt();

        for (int i = 1; i <= numero; ++i){
            System.out.println("1");
            for (int j = 1; j <= i; ++j){
                System.out.println();
            }

        }
    }
}
