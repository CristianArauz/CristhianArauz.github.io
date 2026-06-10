
package practicaaprendisaje1;


public class Administrativo extends Personal{

    public double salarioDia;
    public int Htrabajo;
    public double Hextra;
    
    //constructor vacio

    public Administrativo() {
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

    public double getHextra() {
        return Hextra;
    }

    public void setHextra(double Hextra) {
        this.Hextra = Hextra;
    }
    
            
        
    @Override
    public double calcularSalario() {
        double sal= (salarioDia * Htrabajo)+(salarioDia *Hextra);
        return sal;
    }
            
            
            

}
