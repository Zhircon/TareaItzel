public class TarjetaCredito extends TarjetaDebito {
    private float saldoMaximo;
    private float saldoDeudor;
    //Contructores
    public TarjetaCredito(){
    }
    public TarjetaCredito(int nT,String fV,String c,float sMax,float sDeu){
        super(nT,fV,c);
        this.saldoMaximo=sMax;
        this.saldoDeudor=sDeu;
    }
    //Getters
    public float getSaldoMaximo() {
        return saldoMaximo;
    }
    public float getSaldoDeudor() {
        return saldoDeudor;
    }
    //Setters
    public void setSaldoMaximo(float saldoMaximo) {
        this.saldoMaximo = saldoMaximo;
    }
    public void setSaldoDeudor(float saldoDeudor) {
        this.saldoDeudor = saldoDeudor;
    }
    public String toString(){
        return super.toString()+"saladoMaximo:"+saldoMaximo+"saldoDuudor"+saldoDeudor;
    }
}
