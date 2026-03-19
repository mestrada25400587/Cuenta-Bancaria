

public class CuentaBancaria {

    private String numeroCuenta = "Sin asignar";
    private double saldo = 0;
    private String titular;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular) {
        this.titular = titular;
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        int cont = 0;
        for (int i = 0; i < numeroCuenta.length(); i++) {
            cont++;
        }
        if (cont == 10) {
             this.numeroCuenta = numeroCuenta;
           
        } else {
            this.numeroCuenta = "INVALIDO";
        }
    }

    public double setSaldo() {
        return this.saldo;
    }

    public void getSaldo(double saldo) {
        if (this.saldo < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double cantidad, double depositar) {
        if (depositar > 0) {
            this.saldo += cantidad;
        }
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
            return true;
        }
        return false;
    }
    
    public void mostrarInfo(){
     System.out.println("Numero de cuenta " + this.numeroCuenta);
     System.out.println("Saldo: " + this.saldo);
     System.out.println("Titular de la cuenta:" + this.titular);
    }
}