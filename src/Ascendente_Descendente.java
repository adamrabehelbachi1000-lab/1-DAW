import java.util.Scanner;

public class Ascendente_Descendente {
    public static void main(String[] args) {
        int valor1;
        int valor2;
        String orden;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el primer valor: ");
        valor1 = inputValue.nextInt();
        System.out.println("Introduce el segundo valor: ");
        valor2 = inputValue.nextInt();
        System.out.println("Orden ascendente o descendente?: ");
        orden = inputValue.next();

        if (orden.equals("ascendente")){
            if (valor1>valor2) {
                System.out.println("El orden ascendente de los valores es: " + valor2 +"," + valor1);
            }else{
                System.out.println("El orden ascendente de los valores es: " + valor1 +"," + valor2);
            }
        }
       if (orden.equals("descendente")) {
           if (valor1 > valor2) {
               System.out.println("El orden descendente de los valores es: " + valor1 + "," + valor2);
           } else {
               System.out.println("El orden descendente de los valores es: " + valor2 + "," + valor1);
           }
       }
}   }
