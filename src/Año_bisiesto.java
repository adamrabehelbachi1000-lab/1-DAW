import java.util.Scanner;

public class Año_bisiesto {
    public static void main(String[] args) {
        int año;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el año: ");
        año = inputValue.nextInt();

        if ((año % 400 == 0) || (año % 100 > 0 & año % 4 == 0)){
            System.out.println("Año bisiesto");
        } else {
            System.out.println("Año no bisiesto");
        }

    }
}
