
package polimorfismo;

//clase abstracta 
public abstract class Persona {
    //la clase abstracta hace a la vez clase padre  y son abstract
    //encansulamiento
    public int nui;
    public String nombre;
    public String apellido;
    
    //constructor vacio 

    public Persona() {
    }
    //constructor con  parametros 

    public Persona(int nui, String nombre, String apellido) {
        this.nui = nui;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //setter y getter 
    public int getNui() {
        return nui;
    }

    public void setNui(int nui) {
        this.nui = nui;
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
    
    //toda clase abstracta debe tenre un metodo abstracto 
    public abstract double calcularSalario();
    
    
}
