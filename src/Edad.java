import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        int edad;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce la edad: ");
        edad = inputValue.nextInt();

        if (edad>=18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}
