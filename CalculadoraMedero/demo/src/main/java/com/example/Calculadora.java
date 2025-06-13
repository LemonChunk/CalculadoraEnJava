
package com.example;

public class Calculadora implements Operaciones {

    private final ServicioMatematico servicio;

    public Calculadora(ServicioMatematico servicio) {
        this.servicio = servicio;
    }

    @Override
    public int sumar(int a, int b) {
        return a + b;
    }

    @Override
    public int restar(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }

    @Override
    public double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }

    @Override
    public int potencia(int base, int exponente) {
        return servicio.potencia(base, exponente);
    }

    @Override
    public int factorial(int numero) {
        return servicio.factorial(numero);
    }
}
