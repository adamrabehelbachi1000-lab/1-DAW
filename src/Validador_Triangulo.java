import java.util.Scanner;

public class Validador_Triangulo {
    public static void main(String[] args) {
        double lado1;
        double lado2;
        double lado3;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el primer lado del triangulo: ");
        lado1 = inputValue.nextDouble();
        System.out.println("Introduce el seegundo lado del triangulo: ");
        lado2 = inputValue.nextDouble();
        System.out.println("Introduce el tercer lado del triangulo: ");
        lado3 = inputValue.nextDouble();

        if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1) {
            System.out.println("Los lados introducidos si forman un triangulo");
            if (lado1 == lado2 && lado2 == lado3){
                System.out.println("Triangulo equilatero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
                System.out.println("Triangulo isósceles");
            }else {
                System.out.println("Triangulo escaleno");
            }
        }else {
            System.out.println("No es un triangulo");
        }
    }
}
