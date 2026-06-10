
package ejer1;

public class Docentes  extends Persona{
    
    String materia;
    String carrera;
    
    //constructor vacio 

    public Docentes() {
    }
    //constructor con parametros 

    public Docentes(String materia, String carrera) {
        this.materia = materia;
        this.carrera = carrera;
    }

    public Docentes(String materia, String carrera, int nui, String nombre, String direccion) {
        super(nui, nombre, direccion);
        this.materia = materia;
        this.carrera = carrera;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    
}
