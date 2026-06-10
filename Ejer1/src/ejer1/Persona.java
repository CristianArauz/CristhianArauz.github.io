
package ejer1;

//clase padre para la herencia
public class Persona {
    //son los atributos que van a heredar los hijos 
    int nui;
    String nombre;
    String direccion;
    //la clase padre es obligatorio  tener constructres
    //creo un constructor vacio  para cunado  voy  a meter datos por teclado 
    public Persona() {
        
    }
    //constructor con parametros para datos por default

    public Persona(int nui, String nombre, String direccion) {
        this.nui = nui;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    // setter y getter  
    public int getNui(){
        return nui;
    }
    public void setNui(int nui){
        this.nui = nui;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
