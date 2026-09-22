import java.util.Scanner;

public class Precio_Final {
    public static void main(String[] args) {
        double precio;
        double precio_final = 0;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el precio del producto: ");
        precio = inputValue.nextInt();

        if (precio<6){
            precio_final = precio;
            System.out.println("El precio final del producto es sin descuento: " + precio_final);
        } else if (precio>=6 & precio<60) {
            precio_final = precio - (precio*0.05);
            System.out.println("El precio final del producto con el descuento incluido es: " + precio_final);
        }else {
            precio_final = precio - (precio*0.10);
            System.out.println("El precio final del producto con el descuento incluido es: " + precio_final);
        }
    }
}
