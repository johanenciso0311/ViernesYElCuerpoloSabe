import EjemplosSueltos.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {


   @Test
   void PruebaSuma1(){
       assertEquals(4, Calculadora.sumar(2,2));

   }

   @Test
    void PruebaSuma2 (){
       assertEquals(0,Calculadora.sumar(2,-2));
    }

    @Test
    void PruebaResta1 (){
       assertEquals(-14000, Calculadora.restar(1000,1500));
    }

    @Test
    void PruebaResta2 (){
       assertEquals(-33, Calculadora.restar(-3,30));
    }
    @Test
    void prueba1multiplicar() {
        assertEquals(0, Calculadora.multiplicar(0,5));
    }

    @Test
    void prueba2multiplicar() {
        assertEquals(1000, Calculadora.multiplicar(1000, 1));
    }

    @Test
    void prueba1division() {
        assertEquals(0, Calculadora.dividir(0,5));
    }

    @Test
    void prueba2division() {
       assertEquals(0.1,Calculadora.dividir(1,10));
   }



}
