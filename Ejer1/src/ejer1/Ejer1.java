/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer1;
import java.util.Scanner;

// ejemplos de uso de java 28/04/2026
public class Ejer1 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        //vamos a ingresar 3 notas y  calculamos el promedio 
        /**double n1,n2,n3,prom;
        
        System.out.println("Ingrese las notas 1: ");
        n1 = sc.nextDouble();
        System.out.println("Ingrese las notas 1: ");
        n2 = sc.nextDouble();
        System.out.println("Ingrese las notas 1: ");
        n3 = sc.nextDouble();
        
        prom =(n1+n2+n3)/3;
        
        System.out.println("El promedio es: "+prom);
        sc.close();*/
        
        //vamos a calcular con  el  arreglo 
        
        int n;
        double suma=0;
        System.out.println("Cuantos valores desea ingresar: ");
        n = sc.nextInt();
        
        double[] numero = new double[n];
        for(int i =0 ; i<n; i++){
            System.out.println("Ingrese el valor: "+(i+1));
            numero[i]= sc.nextDouble();
            suma+=numero[i];
        }
        System.out.println("El promedio es: "+suma/n);  
    }
    
}
