import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        int valor1;
        int valor2;
        String operacion;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introducel el primer numero: ");
        valor1 = inputValue.nextInt();
        System.out.println("Introduce el segundo numero: ");
        valor2 = inputValue.nextInt();
        System.out.println("Introduce la operación a realizar (+, -, *, /): ");
        operacion = inputValue.next();

        switch (operacion) {
            case "+":
                System.out.println(valor1 + "+" + valor2 + "=" + (valor1 + valor2));
                break;
            case "-":
                System.out.println(valor1 + "-" + valor2 + "=" + (valor1 - valor2));
                break;
            case "*":
                System.out.println(valor1 + "*" + valor2 + "=" + (valor1 * valor2));
                break;
            case "/":
                System.out.println(valor1 + "/" + valor2 + "=" + (valor1/valor2));
                break;
        }
    }
}
