package EjemplosSueltos.ejercicio2;

public class CamelCase {
    public static void main(String[] args) {
        // solución
        camelCase("el-guerrero-sigiloso");
    }

    public static String camelCase(String texto){

        String[] palabras = texto.split("[-_]");


        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < palabras.length; i++) {
            if (i == 0) {

                resultado.append(palabras[i].toLowerCase());
            } else {

                resultado.append(palabras[i].substring(0, 1).toUpperCase()).append(palabras[i].substring(1).toLowerCase());
            }
        }

        return resultado.toString();

    }



}
