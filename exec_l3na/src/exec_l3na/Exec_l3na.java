
package exec_l3na;

import java.util.Scanner;

public class Exec_l3na {

  
    public static void main(String[] args) {
        System.out.println("Vamos a realizar una divicion");
        
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Ingrese el primer numero: ");
                int n1 = sc.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                int n2 = sc.nextInt();

                int res = n1 / n2;
                System.out.println("El resultado de la division es: " + res);

            } catch (ArithmeticException e) {
                System.err.println("Error: no hay division para cero");
            }

            System.out.println("¿Desea continuar? (s/n): ");
            String opcion = sc.next();

            if (opcion.equalsIgnoreCase("n")) {
                System.out.println("Saliendo...");
                break;
            }
        }

        }
    
}
