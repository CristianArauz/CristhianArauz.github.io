
package polimorfismo;

// para el metodo  abstracto  ahi  que incluir el  metodo

public class Operario extends Persona {

    public double SOdia;
    public int diaO;
    public double bonoT;
    
    //creo constructures

    public Operario() {
    }
    //contructor con  aprametros

    public Operario(double SOdia, int diaO, double bonoT, int nui, String nombre, String apellido) {
        super(nui, nombre, apellido);
        this.SOdia = SOdia;
        this.diaO = diaO;
        this.bonoT = bonoT;
    }
    
    //setter getter

    public double getSOdia() {
        return SOdia;
    }

    public void setSOdia(double SOdia) {
        this.SOdia = SOdia;
    }

    public int getDiaO() {
        return diaO;
    }

    public void setDiaO(int diaO) {
        this.diaO = diaO;
    }

    public double getBonoT() {
        return bonoT;
    }

    public void setBonoT(double bonoT) {
        this.bonoT = bonoT;
    }
    
    
    //metodop aBSTRACTO PARA LAS CLASES HIJAS 
    @Override//sobreescribir
    public double calcularSalario() {
       double sal = (SOdia*diaO)+bonoT;
       return sal;
    }
    //se usa clases abstractas se maneja el encansulamiento 
}
