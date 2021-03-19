public class Principal {
    public static void main(String []args){
        //Cliente agni=new Cliente("Agni","tierra","a1g2n3i4");
        
        /*•	Crear un cliente que tiene los tres tipos de cuenta y 
        los dos tipos de tarjetas, 
        el programa debe mostrar los datos del cliente, 
        junto con los datos de las cuentas, */ 
        Cliente itzel=new Cliente("itzel","tierra","1234abcd");
        TarjetaDebito tarjetaDitzel =new TarjetaDebito(1,"hoy","kti");
        TarjetaCredito tarjetaCitzel =new TarjetaCredito(2, "mananita", "ktix2", 1200, 12);
        CuentaAhorro ahorroitzel=new CuentaAhorro(5, 300000, itzel);
        itzel.addCuenta(ahorroitzel);
    }
}
