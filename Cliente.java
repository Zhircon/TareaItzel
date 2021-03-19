public class Cliente {

    private String nombre;
    private String direccion;
    private String rfc;
    private int numCuentas;
    private Cuenta[] cuentas=new Cuenta[3];
    //Constructores
    public Cliente(){
    }
    public Cliente(String n,String d,String r){
        this.nombre=n;
        this.direccion=d;
        this.rfc=r;
    }
    //getters
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getRfc() {
        return rfc;
    }
   public Cuenta getCuenta(int i) {
       return cuentas[i];
   }
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    //Metodos
    public void addCuenta(Cuenta cuentAagregar){
        if(numCuentas<3){
            cuentas[numCuentas]=cuentAagregar;
        }else{
            System.out.println("ya no tengo espacio");
        }
    }
    public String toString(){
        return "Nombre: "+nombre+",Direccion: "+direccion+",rfc: "+rfc;
    }
}
