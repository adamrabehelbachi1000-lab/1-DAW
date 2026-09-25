import java.util.Scanner;

public class Ej_31 {
    public static void main(String[] args) {
        int numero;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un numero para saber sus divisores: ");
        numero = inputValue.nextInt();

        for (int i = 1; i <=numero; i++){
            if (numero % i == 0){
                System.out.println("Divisor: " + i);
            }
        }
    }

}
