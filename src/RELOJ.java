import java.util.Scanner;

public class RELOJ {
    public static void main(String[] args) {
        int hora;
        int minuto;
        int segundo;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce una hora (1-24): ");
        hora = inputValue.nextInt();
        System.out.println("Introduce un minuto (1-60): ");
        minuto = inputValue.nextInt();
        System.out.println("Introduce un segundo (1-60): ");
        segundo = inputValue.nextInt();
        System.out.println(hora + ":" + minuto + ":" + segundo);
        System.out.println("Ahora le sumamos un segundo");
        segundo = segundo + 1;
        if (segundo == 60){
            minuto = minuto + 1;
            segundo = 00;
        }if (minuto == 60) {
            hora = hora + 1;
            minuto = 00;
        }        System.out.println(hora + ":" + minuto + ":" + segundo);
    }
}
