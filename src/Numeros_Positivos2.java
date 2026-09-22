import java.util.Scanner;

public class Numeros_Positivos2 {
    public static void main(String[] args) {
        int numero;
        int positivos = 0;
        int finalizar;
        Scanner inputValue = new Scanner(System.in);

        do {
            System.out.println("Introduce 10 numeros: ");
            for (int i = 0; i < 10; i++){
                numero = inputValue.nextInt();
                if (numero>=0){
                    positivos = positivos + 1;
                }
            }
            System.out.println("Hay " + positivos + " numeros positivos");
            System.out.println("Introduce un 0 para finalizar el programa: ");
            finalizar = inputValue.nextInt();
        }while (finalizar != 0 );
        System.out.println("Programa finalizado");
    }

}
