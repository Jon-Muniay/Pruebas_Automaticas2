package org.example;

public class Calculadora {

    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicacion(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }

    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public int maximo(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public boolean esDivisible(int numero, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        if (numero % divisor == 0) {
            return true;
        }
        return false;
    }
}
