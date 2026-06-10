
package polimorfismo;


public  class Empleado extends Persona{
    
    public double SEdia;
    public int HEdia;
    public int Hextra;
    
    //creo  constructor vacio

    public Empleado() {
    }
    
    
    //creo contructor con  parametros 
    public Empleado(double SEdia, int HEdia, int Hextra, int nui, String nombre, String apellido) {
        super(nui, nombre, apellido);
        this.SEdia = SEdia;
        this.HEdia = HEdia;
        this.Hextra = Hextra;
    }
    
    //sett y gett

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
        double sal =  (SEdia/HEdia)*Hextra;
        return sal;
    }
    
}
