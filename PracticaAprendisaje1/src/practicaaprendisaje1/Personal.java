
package practicaaprendisaje1;


public abstract class Personal {
    
    public int CI;
    public String nombre;
    public String apellido;
    
    //constructor vacio 

    public Personal() {
    }
    //Constructor con  parametros 

    public Personal(int CI, String nombre, String apellido) {
        this.CI = CI;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public abstract double calcularSalario();
    
}
