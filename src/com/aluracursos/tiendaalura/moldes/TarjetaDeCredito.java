package com.aluracursos.tiendaalura.moldes;

public class TarjetaDeCredito {

    private double limite;
    private double saldo;

    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo =limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean restarSaldo(double precio){
        if (saldo >= precio) {
            saldo -= precio;
            return true;
        }
        return false;
    }

}
