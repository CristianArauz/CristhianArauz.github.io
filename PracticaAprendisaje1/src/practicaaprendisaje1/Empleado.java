
package practicaaprendisaje1;


public class Empleado extends Personal{

    public double salarioDia;
    public int Htrabajo;
    public int Hextra;
    
    //contructor vacio

    public Empleado() {
    }
 
    public double getSalarioDia() {
        return salarioDia;
    }

    public void setSalarioDia(double salarioDia) {
        this.salarioDia = salarioDia;
    }

    public int getHtrabajo() {
        return Htrabajo;
    }

    public void setHtrabajo(int Htrabajo) {
        this.Htrabajo = Htrabajo;
    }

    public int getHextra() {
        return Hextra;
    }

    public void setHextra(int Hextra) {
        this.Hextra = Hextra;
    }
    
    
    
    @Override
    public double calcularSalario() {
        double sal = (salarioDia * Htrabajo)+(salarioDia*Hextra);
        return sal;
    }
    
    
}
