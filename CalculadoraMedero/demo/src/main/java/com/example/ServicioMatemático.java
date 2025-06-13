package com.example;

public class ServicioMatematico {

    public int potencia(int base, int exponente) {
        return (int) Math.pow(base, exponente);
    }

    public int factorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo");
        }
        if (numero == 0 || numero == 1) {
            return 1;
        }
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
