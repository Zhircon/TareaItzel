public class CuentaCheques extends Cuenta{
    //Atributos
    private float salarioMinimo;
    private TarjetaCredito tarjeta;
    //Constructores
    public CuentaCheques(){
    }
    public CuentaCheques(int nC,float s,Cliente cl,float sm){
        super(nC,s,cl);
        this.salarioMinimo=sm;
    }
    //getters
    public float getSalarioMinimo() {
        return salarioMinimo;
    }
    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }
    //Setters
    public void setSalarioMinimo(float salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }
    //Metodos
    public void addTarjeta(TarjetaCredito tarjetaAgregar){
        super.ahiTarjeta=true;
        this.tarjeta=tarjetaAgregar;
    }
    public String toString(){
        if(ahiTarjeta==true){
            return super.toString()+"salario minimo:"+salarioMinimo+"tarjeta:"+tarjeta;
        }else{
            return super.toString()+"salario minimo:"+salarioMinimo+"tarjeta:"; 
        }
        
    }
}
