import java.util.Scanner;

public class Tabla_Multiplicar {
    public static void main(String[] args) {
        int numero;
        int resultado;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el numero para mostrar su tabla de multiplicar: ");
        numero = inputValue.nextInt();

        for (int i = 1; i <= 10; i++){
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
