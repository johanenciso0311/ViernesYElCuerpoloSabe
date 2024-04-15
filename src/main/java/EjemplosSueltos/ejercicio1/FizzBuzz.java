package EjemplosSueltos.ejercicio1;

public class FizzBuzz {
    public static String fizzBuzz() {

        StringBuilder prueba= new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                prueba.append("\n");
                prueba.append("fizzbuzz");
            } else if (i % 3 == 0) {
                prueba.append("\n");
                prueba.append("fizz");
            } else if (i % 5 == 0) {
                prueba.append("\n");
                prueba.append("buzz");
            }else{
                prueba.append("\n");
                prueba.append(i);
            }
        }

        return prueba.toString();
    }

}


