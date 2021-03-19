public class CuentaAhorro extends Cuenta {
    private TarjetaDebito tarjeta; 
    public CuentaAhorro(){
    }
    public CuentaAhorro(int nC,float s,Cliente cl){
        super(nC,s,cl);
    }
    //getters
    public TarjetaDebito getTarjeta() {
        return tarjeta;
    }
    //Metodos
    public void addTarjeta(TarjetaDebito tarjetaAgregar){
        super.ahiTarjeta=true;
        this.tarjeta=tarjetaAgregar;
    }
    public String toString(){
        if(ahiTarjeta==true){
            return super.toString();
        }else{
            return super.toString()+"tarjeta:"+tarjeta;
        }
    }
}
