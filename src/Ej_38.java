import java.util.Random;
import java.util.Scanner;

public class Ej_38 {
    public static void main(String[] args) {
        Random aleatorio = new Random(System.currentTimeMillis());
        Scanner inputValue = new Scanner(System.in);
        // Producir nuevo int aleatorio entre 0 y 99
        int secreto = aleatorio.nextInt(100);
        int numero;
        System.out.print("Introduce un numero para adivinar el numero aleatorio (Escribe -1 para rendirte): ");
        numero = inputValue.nextInt();

        if (numero != -1){
            if (numero != secreto){
                do {
                    if (numero > secreto){
                        System.out.print("El número secreto es más pequeño, introduce otro numero: ");
                        numero = inputValue.nextInt();
                    }else {
                        System.out.print("El numero es más grande, introduce otro numero: ");
                        numero = inputValue.nextInt();
                    }
                }while (numero != secreto && numero != -1);
            }
        }
        if (numero == -1){
            System.out.println("Te has rendido");
        }
        if (numero == secreto){
            System.out.println("Has adivinado el numero, es: " + secreto);
        }
    }
}
