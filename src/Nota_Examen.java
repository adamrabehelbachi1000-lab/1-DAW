import java.util.Scanner;

public class Nota_Examen {
    public static void main(String[] args) {
        int nota;
        Scanner  inputValue = new Scanner(System.in);
        System.out.println("Introduce la nota del examen: ");
        nota = inputValue.nextInt();


        if (nota>=0 & nota<3){
            System.out.println("Muy Deficiente");
        } else if (nota>=3 & nota<5) {
            System.out.println("Insuficiente");
        } else if (nota>=5 & nota<6) {
            System.out.println("Suficiente");
        } else if (nota>=6 & nota<7) {
            System.out.println("Bien");
        } else if (nota>=7 & nota<9) {
            System.out.println("Notable");
        } else{
            System.out.println("Sobresaliente");
        }
    }
}
