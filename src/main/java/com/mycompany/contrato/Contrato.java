/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contrato;

/**
 *
 * @author Rodrigo Ruiz de Cos
 */
public class Contrato {
    
    //Creo los atributos del programa
    private double costoLlamadaaaa;
    private double costoMensaje;
    private double Saldo;
    
    //Constructor por parametros
    public Contrato(double costoLlamada, double costoMensaje, double Saldo) {
        this.costoLlamada = costoLlamada;
        this.costoMensaje = costoMensaje;
        this.Saldo = Saldo;
    }
    
    public double getSaldo() {
        return this.Saldo;
    }
    
    public double getcostoLlamada() {
        return this.costoLlamada;
    }
    
    public double getcostoMensaje() {
        return this.costoMensaje;
    }
    
    public void restarSaldo(double cantidad) {
        //realizo la resta con un ternario(me parece mas rapido hacerlo asi)
        Saldo = Saldo >= cantidad ? Saldo-cantidad : Saldo;
    }
}
