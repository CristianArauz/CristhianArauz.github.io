
package ejer1;

//clase hija
public class Estudiantes extends Persona{
    
    String nmatricula;
    String carrera;
    //constructor vacio  para cunado meta datos con  parametros 
    public Estudiantes(){
    }
    //constructor con  parametros apra cuando  ingresamosdatos 
    
    public Estudiantes(String nmatricula, String carrera,int nui, String nombre, String direccion){
        super(nui,nombre,direccion);
        this.nmatricula = nmatricula;
        this.carrera = carrera;
        
    }
    //getter y setter 

    public String getNmatricula() {
        return nmatricula;
    }

    public void setNmatricula(String nmatricula) {
        this.nmatricula = nmatricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
}
