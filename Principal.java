public class Principal {
    public static void main(String []args){
        
        
        //caso 1:
        Cliente itzel=new Cliente("itzel","tierra","1234abcd");
        TarjetaDebito tarjetaDitzel =new TarjetaDebito(1,"hoy","kti");
        TarjetaCredito tarjetaCitzel =new TarjetaCredito(2, "mananita", "ktix2", 1200, 12);
        Cuenta ahorroitzel=new CuentaAhorro(5, 300000, itzel);
        Cuenta chequesitzel=new CuentaCheques(12, 1000000, itzel, 1000); 
        Cuenta inversionitzel=new CuentaInversion(24, 3000, itzel, 32.4f);     
        ((CuentaAhorro)ahorroitzel).addTarjeta(tarjetaDitzel);
        //Caso 2:
        Cliente agni=new Cliente("Agni","tierra","a1g2n3i4");
        TarjetaDebito tarjetaDagni =new TarjetaDebito(51, "ayer", "kti");
        CuentaAhorro ahorroAgni= new CuentaAhorro(5, 12000, agni);
        ahorroAgni.addTarjeta(tarjetaDagni);
        System.out.println(agni);
        System.out.println(ahorroAgni);
        System.out.println("\n\n\n\n");
        //Caso3
        Cliente shakti=new Cliente("Shakti","tierra","a2345");
        TarjetaCredito tarjetaDshakti =new TarjetaCredito(56, "ano", "holi", 30000, 0);
        CuentaCheques ahorroshakti= new CuentaCheques(90, 12000000, shakti, 1000);
        ahorroshakti.addTarjeta(tarjetaDshakti);
        System.out.println(shakti);
        System.out.println(ahorroshakti);

    }
}
