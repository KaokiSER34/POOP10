/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Clase que representa una cuenta bancaria con operaciones básicas como 
 * consultar saldo, depositar y retirar, incluyendo validaciones para
 * evitar retiros sin fondos suficientes.
 * 
 * @author Issmael
 */
public class Cuenta {

    private double saldo;

    /**
     * Constructor por defecto.
     */
    public Cuenta() {
    }

    /**
     * Constructor que inicializa la cuenta con un saldo dado.
     * @param saldo saldo inicial de la cuenta
     */
    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Deposita una cantidad a la cuenta. Si el valor es negativo, lo convierte en positivo.
     * @param monto cantidad a depositar
     */
    public void depositar(double monto) {
        monto = Math.abs(monto);
        this.saldo += monto;
        System.out.println("Se depositaron: " + monto);
        consultar();
    }

    /**
     * Retira una cantidad del saldo disponible si es suficiente.
     * @param monto cantidad a retirar
     * @throws SaldoInsuficienteException si el saldo es insuficiente
     */
    public void retirar(double monto) throws SaldoInsuficienteException {
        monto = Math.abs(monto);
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Se retiraron: " + monto);
            consultar();
        } else {
            throw new SaldoInsuficienteException();
        }
    }

    /**
     * Consulta el saldo actual de la cuenta.
     * @return el saldo disponible
     */
    public double consultar() {
        System.out.println("Su saldo es: " + saldo);
        return saldo;
    }
}