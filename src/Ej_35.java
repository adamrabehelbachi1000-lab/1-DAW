import java.util.Scanner;

public class Ej_35 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int resto = 0;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        numero1 = inputValue.nextInt();
        System.out.println("Introduce el segundo numero: ");
        numero2 = inputValue.nextInt();

        do {
            if (numero2 > numero1){
                System.out.println("El divisor no puede ser mayor que el dividendo");
                System.out.println("Introduce el primer numero: ");
                numero1 = inputValue.nextInt();
                System.out.println("Introduce el segundo numero: ");
                numero2 = inputValue.nextInt();
            }
        }while (numero2 > numero1);

        do {
            resto = numero1 - numero2;
            System.out.print(numero1 + "-" + numero2 + "=" + resto + " ");
            numero1 = numero1 - numero2;
        }while ((numero1 - numero2)>=0);
        System.out.println("\nEl resto es: " + resto);
        System.out.println("Division con el metodo de restas sucesivas");
    }
}
