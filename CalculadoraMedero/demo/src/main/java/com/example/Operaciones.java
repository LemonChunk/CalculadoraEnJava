package com.example;

public interface Operaciones {
    int sumar(int a, int b);
    int restar(int a, int b);
    int multiplicar(int a, int b);
    double dividir(int a, int b) throws ArithmeticException;
    int potencia(int base, int exponente);
    int factorial(int numero) throws IllegalArgumentException;
    
}
