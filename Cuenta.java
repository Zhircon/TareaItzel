public class Cuenta {
    //Atributos
    protected int numeroCuenta;
    protected float saldo;
    protected Cliente cliente; 
    protected boolean ahiTarjeta;
    //Construstructores
    public Cuenta(){
    }
    public Cuenta(int nC,float s){
        this.numeroCuenta=nC;
        this.saldo=s;
    }
    
    public Cuenta(int nC,float s,Cliente cl){
        this.numeroCuenta=nC;
        this.saldo=s;
        this.cliente=cl;
    }
    //Getters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public float getSaldo() {
        return saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public boolean getAhiTarjeta() {
        return ahiTarjeta;
    }
    //Setters 
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setAhiTarjeta(Boolean ahiTarjeta) {
        this.ahiTarjeta = ahiTarjeta;
    }
    //Metodos
    public String toString(){
        return "numero cuenta:"+numeroCuenta+"saldo:"+saldo+"cliente"+cliente;
    }
}
