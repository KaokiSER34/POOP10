/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Clase principal que realiza operaciones con arreglos, divisiones, excepciones
 * y gestiona una cuenta bancaria simulada utilizando las clases Cuenta y 
 * SaldoInsuficienteException.
 * 
 * @author Issmael
 */
public class POOP10 {

    /**
     * Constructor por defecto de la clase POOP10.
     */
    public POOP10() {
    }

    /**
     * Método principal que ejecuta la lógica del programa.
     * @param args los argumentos de línea de comandos
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        try {
            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println("Hola mundo");

        int a = 0;
        float b = 1;
        double x = a / b;
        System.out.println(x);

        float y = dividir(a, 0);
        System.out.println(y);

        try {
            int f = sumar(3, 4);
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
        }

        Cuenta cuenta1 = new Cuenta(1500);

        try {
            cuenta1.consultar();
            cuenta1.depositar(10);
            cuenta1.depositar(-50);
            cuenta1.retirar(560);
            cuenta1.retirar(1005);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Método que realiza una división entre un entero y un flotante.
     * @param a dividendo
     * @param b divisor
     * @return resultado de la división
     */
    private static float dividir(int a, float b) {
        return a / b;
    }

    /**
     * Método simulado de suma que lanza una excepción no implementada.
     * @param i primer número
     * @param j segundo número
     * @return nunca retorna, lanza excepción
     * @throws UnsupportedOperationException indica que el método no está implementado
     */
    private static int sumar(int i, int j) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Metodo sumar aun no implementado");
    }
}