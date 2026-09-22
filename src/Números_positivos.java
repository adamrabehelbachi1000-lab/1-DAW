import java.util.Scanner;

public class Números_positivos {
    public static void main(String[] args) {
        int numero;
        int positivos = 0;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce 10 numeros: ");
        for (int i = 0; i < 10; i++){
            numero = inputValue.nextInt();
            if (numero>=0){
                positivos = positivos + 1;
            }
        }
        System.out.println("Hay " + positivos + " numeros positivos");
    }
}
