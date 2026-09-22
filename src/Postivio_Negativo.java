import java.util.Scanner;

public class Postivio_Negativo {
    public static void main(String[] args) {
        int valor;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un valor: ");
        valor = inputValue.nextInt();
        if (valor>=0){
            System.out.println("El valor es positivo");
        }else{
            System.out.println("El valor es negativo");
        }
    }
}
