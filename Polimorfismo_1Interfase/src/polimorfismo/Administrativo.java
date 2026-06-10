
package polimorfismo;


public class Administrativo extends Persona implements BonoNav{
    
    public double salarioMensual;
    public int mTrab;

    public Administrativo() {
    }

    public Administrativo(double salarioMensual, int mTrab, int nui, String nombre, String apellido) {
        super(nui, nombre, apellido);
        this.salarioMensual = salarioMensual;
        this.mTrab = mTrab;
    }
    
    //geter y setter 

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public int getmTrab() {
        return mTrab;
    }

    public void setmTrab(int mTrab) {
        this.mTrab = mTrab;
    }
    

    @Override
    public double calcularSalario() {
        double salarioAd = salarioMensual + calcularbono();
        return salarioAd;
    }

    @Override
    public double calcularbono() {
        double bonoAd = mTrab *30;
        return bonoAd;
    }
    
    
}
