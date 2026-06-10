
package practicaaprendisaje1;
import java.util.Scanner;

public class PracticaAprendisaje1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("******SISTEMA DE CALCULO DE SUELDO DIARIO***");
        System.out.println("Cuantos trabajodes va ingresar? ");
        int n = sc.nextInt();
        
        Personal[] lista = new Personal[n];
        
        for(int i= 0; i<n;i++){
            System.out.println("Trabajadores "+ (i+1)+ " tipo" + " - Tipo: 1=Administrativo  2=Tecnico  3=Empleado");
            int tipo = sc.nextInt();
            
            switch(tipo){
                case 1: 
                    Administrativo a1 = new Administrativo();
                    System.out.println("Ingrese el nombre: ");
                    String nom = sc.next();
                    a1.setNombre(nom);
                    
                    System.out.println("Ingrese el Apellido: ");
                    String ap = sc.next();
                    a1.setApellido(ap);
                    
                    System.out.println("Ingrese Salario por dia: ");
                    double Sdia = sc.nextDouble();
                    a1.setSalarioDia(Sdia);
                    
                    System.out.println("Ingrese horas de tabajo por dia: ");
                    int Hdia = sc.nextInt();
                    a1.setHtrabajo(Hdia);
                    
                    System.out.println("Ingrese Horas extra: ");
                    int Hextra = sc.nextInt();
                    a1.setHextra(Hextra);
                    
                    lista[i]= a1;
                    break; 
                    
                case 2:
                    Tecnico t = new Tecnico();
                    System.out.println("Ingrese el nombre: ");
                    String no = sc.next();
                    t.setNombre(no);
                    
                    System.out.println("Ingrese el Apellido: ");
                    String ape = sc.next();
                    t.setApellido(ape);
                    
                    System.out.println("Ingrese Salario por dia: ");
                    double Saldia = sc.nextDouble();
                    t.setSalarioDia(Saldia);
                    
                    System.out.println("Ingrese horas de tabajo por dia: ");
                    int Hodia = sc.nextInt();
                    t.setHtrabajo(Hodia);
                    
                    System.out.println("Ingrese el valor del bono: ");
                    int bo = sc.nextInt();
                    t.setBono(bo);
                    lista[i] = t;
                    break;
                    
                case 3: 
                    Empleado e = new Empleado();
                    System.out.println("Ingrese el nombre: ");
                    String nomb = sc.next();
                    e.setNombre(nomb);
                    
                    System.out.println("Ingrese el Apellido: ");
                    String apel = sc.next();
                    e.setApellido(apel);
                    
                    System.out.println("Ingrese Salario por dia: ");
                    double Sadia = sc.nextDouble();
                    e.setSalarioDia(Sadia);
                    
                    System.out.println("Ingrese horas de tabajo por dia: ");
                    int Hrdia = sc.nextInt();
                    e.setHtrabajo(Hrdia);
                    
                    System.out.println("Ingrese Horas extra: ");
                    int Hrextra = sc.nextInt();
                    e.setHextra(Hrextra);
                    
                    lista[i]= e;
                    break; 
                    
            }
            
        }

        // mostrar resultados
        System.out.println("\n========== SALARIOS ==========");
        for (Personal p : lista) {
            System.out.println("Sr/a: " + p.getNombre() + " " + p.getApellido() + " | Salario: $" + p.calcularSalario());
        }
    }
    
}
