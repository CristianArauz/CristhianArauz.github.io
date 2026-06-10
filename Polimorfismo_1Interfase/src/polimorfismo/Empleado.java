
package polimorfismo;


public  class Empleado extends Persona{
    
    public double SEdia;
    public int HEdia;
    public int Hextra;
    public int mTrab;
    
    //creo  constructor vacio

    public Empleado() {
    }
    
    
    //creo contructor con  parametros 

    public Empleado(double SEdia, int HEdia, int Hextra, int mTrab, int nui, String nombre, String apellido) {
        super(nui, nombre, apellido);
        this.SEdia = SEdia;
        this.HEdia = HEdia;
        this.Hextra = Hextra;
        this.mTrab = mTrab;
    }

    //sett y gett

    public int getmTrab() {
        return mTrab;
    }

    public void setmTrab(int mTrab) {
        this.mTrab = mTrab;
    }
    
    public double getSEdia() {
        return SEdia;
    }

    public void setSEdia(double SEdia) {
        this.SEdia = SEdia;
    }

    public int getHEdia() {
        return HEdia;
    }

    public void setHEdia(int HEdia) {
        this.HEdia = HEdia;
    }

    public int getHextra() {
        return Hextra;
    }

    public void setHextra(int Hextra) {
        this.Hextra = Hextra;
    }
    

    //herencia
    @Override
    public double calcularSalario() {
        double salarioBase = SEdia * HEdia;
        double horasExtra = Hextra * (SEdia / 8) * 1.5;
        double bonoPorMeses = mTrab * 50;
        double sal = salarioBase + horasExtra + bonoPorMeses;
        return sal;
    } 
    
}
