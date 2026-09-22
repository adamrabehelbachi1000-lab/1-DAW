import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        double kg;
        double m;
        double imc;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce tu peso (kg): ");
        kg = inputValue.nextDouble();
        System.out.println("Introduce tu altura (m): ");
        m = inputValue.nextDouble();
        imc = kg/(m*m);

        if (imc < 18.5){
            System.out.println("Tu índice de masa corporal esta en Bajo peso");
        }else if (imc>=18.5 & imc<=24.9){
            System.out.println("Tu índice de masa corporal esta en Normal");
        }else if (imc>=25 & imc<=29.99){
            System.out.println("Tu índice de masa corporal esta en Sobrepeso");
        }else {
            System.out.println("Tu índice de masa corporal esta en Obesidad");
        }

    }
}
