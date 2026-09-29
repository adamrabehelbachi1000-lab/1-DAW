import java.util.Scanner;

public class Ej_39 {
    public static void main(String[] args) {
        int lado1; int lado2; int lado3;
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Introduce el lado a del triangulo: ");
        lado1 = inputValue.nextInt();
        System.out.print("Introduce el lado b del triangulo: ");
        lado2 = inputValue.nextInt();
        System.out.print("Introduce el lado c del triangulo: ");
        lado3 = inputValue.nextInt();

        if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1){
            if ((lado3 * lado3) < (lado1 * lado1 + lado2 * lado2)){
                System.out.println("El triangulo es acutángulo");
            } else if ((lado3 * lado3) == (lado1 * lado1 + lado2 * lado2)){
                System.out.println("El triangulo es rectangulo");
            }else {
                System.out.println("El triangulo es obtusángulo");
            }
        }else {
            System.out.println("Imposible");
        }
    }
}
