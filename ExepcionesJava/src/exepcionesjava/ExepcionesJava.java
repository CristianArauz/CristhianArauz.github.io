
package exepcionesjava;
import java.util.Scanner;

public class ExepcionesJava {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Programa que calcula una divicion");
        
        try{
        System.out.println("Ingrese el primer nuemero: ");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n2 = sc.nextInt();
        
        int res = n1/n2;
        System.out.println("El resultado de la division es: "+res);
        }catch(ArithmeticException e){
            System.err.println("Error no division para cero");    
        }finally{
            System.out.println("No se interrumpio");
        }
    }
    //arithmeticException  
}
