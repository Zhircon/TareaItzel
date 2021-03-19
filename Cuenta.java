public class Cuenta {
    //Atributos
    protected int numeroCuenta;
    protected float saldo;
    protected Cliente cliente; 
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
}
