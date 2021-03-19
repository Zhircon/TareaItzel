public class TarjetaDebito {
    //Atributos
    protected int numeroTarjeta;
    protected String fechaVencimiento;
    protected String codigo;
    //contructores
    public TarjetaDebito(){
    }
    public TarjetaDebito(int nT,String fV,String c){
        this.numeroTarjeta=nT;
        this.fechaVencimiento=fV;
        this.codigo=c;
    }
    //getters
    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    public String getCodigo() {
        return codigo;
    }
    //Setters
    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}