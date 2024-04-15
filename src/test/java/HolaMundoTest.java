import static org.junit.jupiter.api.Assertions.*;

class HolaMundoTest {

    @org.junit.jupiter.api.Test
    void prueba1() {
        assertEquals("JOHAN", HolaMundo.holaMundo("johan"));
    }

    @org.junit.jupiter.api.Test
    void prueba2() {
        assertEquals("JOHAN", HolaMundo.holaMundo("jOhAn"));
    }


}