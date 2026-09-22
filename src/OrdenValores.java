import java.util.Scanner;

public class OrdenValores {
    public static void main(String[] args) {
        int valor1;
        int valor2;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el primer valor: ");
        valor1 = inputValue.nextInt();
        System.out.println("Introduce el segundo valor: ");
        valor2 = inputValue.nextInt();

        if (valor1>valor2){
            System.out.println("El orden ascendente de los numeros es: " + valor2 + "," + valor1);
        } else{
            System.out.println("El orden ascendente de los numeros es: " + valor1 + "," + valor2);
        }
    }
}
