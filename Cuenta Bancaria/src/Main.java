
public class Main {
    public static void main(String[] args){
    
     CuentaBancaria c1 = new CuentaBancaria("2", 200, "Tere");
     c1.setNumeroCuenta("0123456789101112131415");
     c1.mostrarInfo();
     
     c1.setNumeroCuenta("0123456789");
     c1.retirar(50);
     c1.mostrarInfo();
    }
}
