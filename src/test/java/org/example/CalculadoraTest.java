package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
        System.out.println("Iniciando test...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Finalizando test...");
    }

    @Test
    void suma() {
        assertEquals(5, calculadora.suma(1, 3));
        assertEquals(-1, calculadora.suma(-3, 2));
    }

    @Test
    void resta() {
        assertEquals(1, calculadora.resta(5, 4));
        assertEquals(-7, calculadora.resta(3, 8));
    }

    @Test
    void multiplicacion() {
        assertEquals(12, calculadora.multiplicacion(3, 5));
        assertEquals(0, calculadora.multiplicacion(50, 0));
    }

    @Test
    void division() {
        assertEquals(4, calculadora.division(20, 5));
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.division(10, 0);
        });
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }

    @Test
    void esPar() {
        assertTrue(calculadora.esPar(6));
        assertFalse(calculadora.esPar(9));
    }

    @Test
    void maximo() {
        assertEquals(9, calculadora.maximo(2, 6, 2));
        assertEquals(7, calculadora.maximo(7, 6, 7));
        assertEquals(12, calculadora.maximo(12, 8, 3));
    }

    @Test
    void esDivisible() {
        assertTrue(calculadora.esDivisible(10, 2));
        assertFalse(calculadora.esDivisible(7, 3));

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.esDivisible(10, 0);
        });
        assertEquals("El divisor no puede ser cero", exception.getMessage());
    }
}