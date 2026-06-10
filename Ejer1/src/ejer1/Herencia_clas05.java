
package ejer1;
// herencia 05/05/2026
import java.util.Scanner;
public class Herencia_clas05 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Estudiantes e1 = new Estudiantes(); // constructor vacio 
        Estudiantes e2 = new Estudiantes("SGD-1001", "Sistemas y Gestion de DATa",1723023231,"Cristhian","Sangolqui");//constructor con parametros
        //Docentes d1 = new Docentes("Programacion", "desarrollo de Software", 1724352107, "Marjorie", "Quito");
        
        //System.out.println("El docuente es: "+ d1.getNombre() + "Es docente de: "+ d1.getMateria());
        System.out.println("El estudiante:"+e2.getNombre()+" es de "+e2.getCarrera());
        System.out.println("Ingrese el nombre del estudiante");
        String ne = sc.nextLine();
        
        e1.setNombre(ne);
        System.out.println("El estudainte: "+e1.getNombre());
          //ingresar  los valores por  teclado  sean de docentes y  del estudainte 
          //dentro de un  arreglo 
          //y  al final decidir cualquiero imprimir salgo del programa cuando decida dejar de ingresar datos
          
    }
    
}
