
package practicaaprendisaje1;


public class Tecnico extends Personal {

    public double salarioDia;
    public int Htrabajo;
    public double bono;

    //constructor vacio
    public Tecnico() {
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

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
    
    @Override
    public double calcularSalario() {
        double sal = (salarioDia* Htrabajo)+ bono;
        return sal;
    }
    
}
