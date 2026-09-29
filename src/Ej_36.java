import java.util.Scanner;

public class Ej_36 {
    public static void main(String[] args) {
        int numero;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un numero para pasarlo a binario: ");
        numero = inputValue.nextInt();

        System.out.print("Binario: ");
        if (numero >= 128) {
            System.out.print("1");
            numero = numero - 128;
        } else {
            System.out.print("0");
        }
        if (numero >= 64) {
            System.out.print("1");
            numero = numero - 64;
        } else {
            System.out.print("0");
        } if (numero >= 32){
            System.out.print("1");
            numero = numero - 32;
        }else {
            System.out.print("0");
        } if (numero >= 16){
            System.out.print("1");
            numero = numero - 16;
        }else {
            System.out.print("0");
        } if (numero >= 8){
            System.out.print("1");
            numero = numero - 8;
        }else {
            System.out.print("0");
        } if (numero >= 4){
            System.out.print("1");
            numero = numero - 4;
        }else {
            System.out.print("0");
        } if (numero >= 2){
            System.out.print("1");
            numero = numero - 2;
        }else {
            System.out.print("0");
        } if (numero >= 1){
            System.out.print("1");
            numero = numero - 1;
        }else {
            System.out.print("0");
        }
    }
}
