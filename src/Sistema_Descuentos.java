import java.util.Scanner;

public class Sistema_Descuentos {
    public static void main(String[] args) {
        double importe;
        String socio;
        double importe_total;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce tu importe de la compra:");
        importe = inputValue.nextDouble();
        System.out.println("Eres socio? (si/no): ");
        socio = inputValue.next();

        if (socio.equals("si")){
            if (importe > 50 & importe <=100){
                importe_total = importe - (importe * 0.10);
                System.out.println("El precio total con el descuento es de: " + importe_total);
            } else if (importe>100){
                importe_total = importe - (importe * 0.15);
                System.out.println("El precio total con el descuento es de: " + importe_total);
            }else {
                importe_total = importe;
                System.out.println("El precio total es: " + importe_total);
            }
        }else if (socio.equals("no")){
            if (importe > 50){
                importe_total = importe - (importe * 0.05);
                System.out.println("El precio total con el descuento es de: " + importe_total);
            }else {
                importe_total = importe;
                System.out.println("El precio total es: " + importe_total);
            }
        }

    }
}
