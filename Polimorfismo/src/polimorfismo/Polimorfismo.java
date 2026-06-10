//12/05/2026 polimorfismo
package polimorfismo;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Polimorfismo {

    
    public static void main(String[] args) {
       
           Scanner sc = new Scanner(System.in);
           
           Empleado e1 = new Empleado();
           Empleado e2 = new Empleado(20,8,3,1724352107,"Cristhian","AJ");
           //double SEdia, int HEdia, int Hextra, int nui, String nombre, String apellido
           
           /*Operario o1 = new Operario();
           Operario o2 = new Operario(15,20,20,1724352107,"Cristhian","Arz");*/
           
           /*System.out.println("El señor: "+ o2.getNombre()+ o2.getApellido()+ " Tiene un salario de: $"+o2.calcularSalario());
           //-------------------------------
           System.out.println("Ingrese el  nombre del trabajador: ");
           String nd = sc.next();
           o1.setNombre(nd);
           
           System.out.println("Ingrese el apellido del trabajador: ");
           String ap = sc.next();
           o1.setNombre(ap);
           
           System.out.println("Ingrese el salirio del trabajador: ");
           Double salT = sc.nextDouble();
           o1.setSOdia(salT);
           
           System.out.println("Ingrese los dias del trabajador: ");
           int dtra = sc.nextInt();
           o1.setDiaO(dtra);
           
           System.out.println("Ingrese el bono del trabajador: ");
           double bo = sc.nextDouble();
           o1.setBonoT(bo);
           
           System.out.println("El señor: "+o2.getNombre() + " "+o2.getApellido()+ " tiene un  salario de: $"+o2.calcularSalario());*/
           // empleado
           
           System.out.println("El sr: "+e2.getNombre()+" "+ e2.getApellido()+ " tiene saliro por las horas "+ e2.getHextra()+ " de: $"+e2.calcularSalario());
           
           System.out.println("Ingrese el nombre del empleado: ");
           String no = sc.next();
           e1.setNombre(no);
           
           System.out.println("Ingrese el nombre del empleado: ");
           String ap = sc.next();
           e1.setApellido(ap);
           
           System.out.println("Ingrese el salario por dia: ");
           double sd = sc.nextDouble();
           e1.setSEdia(sd);
           
           int dto = 0;
           boolean valido = false;
           do{
                try{
                System.out.println("Ingrese horas labrorales: ");
                int hl= sc.nextInt();
                if(dto<=0 || dto>30)
                        System.out.println("Valor fuera de rango");
                e1.setHEdia(hl);
                }catch(InputMismatchException e){
                    System.out.println("Debe ingresar valores entre 1 y 30 solo nuneros");
                }  
           }while(!valido);

           System.out.println("Ingrese las horas extra: ");
           int he = sc.nextInt();
           e1.setHextra(he);
           
           System.out.println("El sr: "+e1.getNombre()+" "+e1.getApellido()+" Tiene: "+e1.getHextra()+" su Salario es de: $"+e1.calcularSalario());
           
    }
    
}

//para nosotros trabajar con  el polimorfismo  la merjor forma es 
//clases abstractas = clase padre
//maneja encansulamiento

//ingresamos los valores mediante unbucle  donde me difa cuatos voy  a ingresar 
//validar todos los valores ingresados por teclado con try y catch y  dentro  de un bucle que si no ingreso 
//correctamente debe solicitar ingresar nuevamente 

