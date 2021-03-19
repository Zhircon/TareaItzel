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
        CuentaCheques chequesitzel=new CuentaCheques(12, 1000000, itzel, 1000); 
        CuentaInversion inversionitzel=new CuentaInversion(24, 3000, itzel, 32.4f);     
        ahorroitzel.addTarjeta(tarjetaDitzel);
        chequesitzel.addTarjeta(tarjetaCitzel);
        itzel.addCuenta(ahorroitzel);
        itzel.addCuenta(chequesitzel);
        itzel.addCuenta(inversionitzel);
    }
}
