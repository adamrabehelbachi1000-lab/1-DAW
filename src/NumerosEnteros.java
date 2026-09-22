import java.util.Scanner;

public class NumerosEnteros {
    public static void main(String[] args) {
        float Numero1;
        float Numero2;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el numero 1:");
        Numero1 = inputValue.nextFloat();
        System.out.println("Introduce el numero 2:");
        Numero2 = inputValue.nextFloat();

        float suma = (Numero1 + Numero2);
        float resta = (Numero1 - Numero2);
        float multiplicacion = (Numero1 * Numero2);
        float division = (Numero1/Numero2);

        System.out.println("La suma de los dos numeros es: " + suma);
        System.out.println("La resta de los dos numeros es: " + resta);
        System.out.println("La multiplicacion de los dos numeros es: " + multiplicacion);
        System.out.println("La division de los dos numeros es: " + division);
    }
}
