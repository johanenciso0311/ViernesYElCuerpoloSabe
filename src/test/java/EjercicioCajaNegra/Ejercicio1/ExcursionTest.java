package EjercicioCajaNegra.Ejercicio1;

import EjercicioCajaNegra.Ejercicio1.Excursion;
import org.junit.jupiter.api.*;

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
        Assertions.assertEquals(65, e.CalcularPrecioAlumno());
    }

    @Test
    void calcularCosteExcursion() {
    }
}