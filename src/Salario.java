import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        int precioH;
        int horas;
        int horas_excedidas = 0;
        double bruto = 0;
        double neto = 0;
        double impuestos = 0;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el precio/h: ");
        precioH = inputValue.nextInt();
        System.out.println("Introduce el numero de horas: ");
        horas = inputValue.nextInt();
        if (horas>35){
            horas_excedidas = horas - 35;
        }
        bruto = (horas * precioH) + (horas_excedidas * (precioH * 1.5));
        if (bruto<=500){
            impuestos = 0;
            neto = bruto;
        }else if (bruto <= 900){
            impuestos = (bruto - 500) * 0.25;
            neto = bruto - impuestos;
        }else if (bruto>900){
            impuestos = (400 * 0.25) + ((bruto - 900) * 0.45);
            neto = bruto - impuestos;
        }
        System.out.println("El pago bruto es: " + bruto);
        System.out.println("El pago de impuestos es: " + impuestos);
        System.out.println("El salario neto es: " + neto);

    }
}