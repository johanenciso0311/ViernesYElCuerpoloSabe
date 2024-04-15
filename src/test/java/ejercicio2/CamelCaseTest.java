package ejercicio2;

import EjemplosSueltos.ejercicio2.CamelCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseTest {

    @Test
    void camelCaseTest1() {
        assertEquals("elGuerreroSigiloso", CamelCase.camelCase("el-guerrero-sigiloso"));
    }

    @Test
    void camelCaseTest2() {
        assertEquals("ElGuerreroSigiloso", CamelCase.camelCase("El-guerrero_Sigiloso"));
    }

    @Test
    void camelCaseTest3() {
        assertEquals("ElGuerreroSigiloso", CamelCase.camelCase("El_Guerrero_Sigiloso"));
    }
}