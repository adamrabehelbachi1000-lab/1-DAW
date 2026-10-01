package Refuerzo1;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String contraseña; int max_intentos = 3;
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Introduce la contraseña (maximo intentos 3): ");
        contraseña = inputValue.next();

            do {
                if (!contraseña.equals("daw2026") && max_intentos > 1){
                    max_intentos = max_intentos - 1;
                    System.out.print("Incorrecta. Te quedan " + max_intentos + " intentos");
                    System.out.print("\nIntroduce la contraseña (maximo intentos 3): ");
                    contraseña = inputValue.next();
                }
            }while (max_intentos > 1 && !contraseña.equals("daw2026"));

            if (contraseña.equals("daw2026")){
                System.out.println("Acceso concedido");
            }
    }
}
