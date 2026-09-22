import java.util.Scanner;

public class circunferencia {
    public static void main(String[] args) {
    double PI = 3.14159;
    double radius;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el radio de tu cincunferencia:");
        radius = inputValue.nextFloat();
    double length = 2 * PI * radius;
    double area = PI * radius * radius;

        System.out.println("El perimetro de tu circunferencia es: " + length);
        System.out.println("El area de tu circunferencia es: " + area);

    }
}
