import java.util.Scanner;

public class TARIFA_ELECTRICA {
    public static void main(String[] args) {
        int kwh;
        double consumo = 0;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce tu consumo mensual (kWh): ");
        kwh = inputValue.nextInt();

        if (kwh >= 0 & kwh <= 100){
            System.out.println("Tu consumo mensual es de 0.10€/kWh");
            consumo = (kwh * 0.10);
        } else if (kwh >= 101 & kwh <= 300) {
            System.out.println("Tu consumo mensual es de 0.15€/kWh");
            consumo = (kwh * 0.15);
        }else {
            System.out.println("Tu consumo mensual es de 0.20€/kWh");
            consumo = (kwh * 0.20);
        }
        System.out.println("El precio total a pagar este mes es de: " + consumo);
    }
}
