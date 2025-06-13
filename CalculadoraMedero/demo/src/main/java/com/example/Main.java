package com.example;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Calculadora
        Calculadora calculadora = new Calculadora();

        // Realizar algunas operaciones
        int suma = calculadora.sumar(5, 3);
        int resta = calculadora.restar(10, 4);
        int multiplicacion = calculadora.multiplicar(6, 7);
        double division = 0;
        try {
            division = calculadora.dividir(8, 2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        int potencia = calculadora.potencia(2, 3);
        int factorial = 0;
        try {
            factorial = calculadora.factorial(5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Imprimir los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Potencia: " + potencia);
        System.out.println("Factorial: " + factorial);

    }
}