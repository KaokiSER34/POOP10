/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Excepción personalizada que indica que no hay suficiente saldo disponible
 * para completar un retiro en la cuenta bancaria.
 * 
 * @author Issmael
 */
public class SaldoInsuficienteException extends Exception {

    /**
     * Constructor que lanza la excepción con un mensaje predeterminado.
     */
    public SaldoInsuficienteException() {
        super("Saldo insuficiente");
    }
}