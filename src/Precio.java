import java.util.Scanner;

public class Precio {
    public static void main(String[] args) {
        double precio;
        double precio_rebajado;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el precio; ");
        precio = inputValue.nextInt();
        System.out.println("Introduce el precio rebajado: ");
        precio_rebajado = inputValue.nextInt();

        double descuento = (precio - precio_rebajado)/precio * 100;
        System.out.println("El descuento de tu precio es: " + descuento);

    }
}
