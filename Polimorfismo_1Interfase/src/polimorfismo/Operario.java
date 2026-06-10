
package polimorfismo;

// para el metodo  abstracto  ahi  que incluir el  metodo

public class Operario extends Persona implements BonoNav,Hextras{

    public double SOdia;
    public int diaO;
    public double bonoT;
    public int mTrab;
    
    
    //creo constructures

    public Operario() {
    }
    //contructor con  aprametros

    public Operario(double SOdia, int diaO, double bonoT, int mTrab, int nui, String nombre, String apellido) {
        super(nui, nombre, apellido);
        this.SOdia = SOdia;
        this.diaO = diaO;
        this.bonoT = bonoT;
        this.mTrab = mTrab;
    }
     //setter getter
    public int getmTrab() {
        return mTrab;
    }

    public void setmTrab(int mTrab) {
        this.mTrab = mTrab;
    }

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
       double sal = (SOdia*diaO)+ bonoT+ calculohextra();
       return sal;
    }
    //se usa clases abstractas se maneja el encansulamiento 

    @Override
    public double calcularbono() {
        double bnav = (mTrab*20);
        return bnav;
    }

    @Override
    public double calculohextra() {
    
        double chextra;
        if(diaO>40){
            chextra = (diaO - 8)*((SOdia/8)*1.5);
        }else{
            chextra =0;
        }
        return chextra;
    }
}
