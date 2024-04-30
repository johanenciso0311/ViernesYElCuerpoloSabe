package EjercicioCajaNegra.ejercicio6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ejercicio6Test {

    @Test
    @DisplayName("Casos de prueba 1, 4, 6, 8")
    void validarDni1() {
        assertTrue(EjercicioArray.validarDni("00023000T"));
    }

    @Test
    @DisplayName("Caso de prueba 2")
    void validarDni2() {
        assertFalse(EjercicioArray.validarDni("000023000T"));
    }

    @Test
    @DisplayName("Caso de prueba 3")
    void validarDni3() {
        assertFalse(EjercicioArray.validarDni("0023000T"));
    }

    @Test
    @DisplayName("Caso de prueba 5")
    void validarDni5() {
        assertFalse(EjercicioArray.validarDni("T0023000T"));
    }

    @Test
    @DisplayName("Caso de prueba 7")
    void validarDni7() {
        assertFalse(EjercicioArray.validarDni("000230006"));
    }
}