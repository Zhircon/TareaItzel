public class CuentaInversion extends Cuenta{
    //Atributos
    private float interesAnual;
    //Constructores 
    public CuentaInversion(){

    }
    public CuentaInversion(int nC,float s,Cliente cl,float iA){
        super(nC,s,cl);
        this.interesAnual=iA;
    }
    //getters
    public float getInteresAnual() {
        return interesAnual;
    }
    //Setters 
    public void setInteresAnual(float interesAnual) {
        this.interesAnual = interesAnual;
    }
    public String toString(){
        return super.toString()+"interes anual: "+interesAnual;
    }
}
