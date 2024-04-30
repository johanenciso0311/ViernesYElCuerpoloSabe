package EjercicioCajaNegra;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExcursionTest {

    Excursion e;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("precio alumno: 100 alumnos")
    void calcularPrecioAlumno1() {
        e = new Excursion(100); // instancio el objeto excursión con 100 alumnos
        assertEquals(65, e.calcularPrecioAlumno());
    }

    @Test
    void calcularCosteExcursion() {
    }
}