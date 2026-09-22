import java.util.Scanner;

public class Calificador_notas {
    public static void main(String[] args) {
        double nota;
        String practicas;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce tu nota de examen (0-10): ");
        nota = inputValue.nextDouble();
        System.out.println("Has entregado todas las practicas? (si/no): ");
        practicas = inputValue.next();

        if (nota < 5){
            System.out.println("Has suspendido");
        } else if (nota>= 5 & practicas.equals("no")) {
            System.out.println("Suspenso por practicas pendientes");
        } else if (nota>=5 && nota<=6.9 && practicas.equals("si")) {
            System.out.println("Aprobado");
        } else if (nota>=7 && nota<=8.9 && practicas.equals("si")) {
            System.out.println("Notable");
        }else if (nota>=9 && nota<=10 && practicas.equals("si")){
            System.out.println("Sobresaliente");
        }
    }
}
