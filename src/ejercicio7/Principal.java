package ejercicio7;

/*
 * Haz un método que reciba la lista de cadenas que se muestra a continuación y, pasándole una letra,
 *           nos cuente cuántas veces aparece esa letra en cada palabra
 * */

import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    static ArrayList<String> lista = new ArrayList<String>(Arrays.asList("Nicolás", "Francisco", "Hugo", "Lucas", "Ruben", "Iker", "Sofia", "Jose Luis", "Diego", "Rico", "Amanda", "Francisca"));

    public static void main(String[] args) {

        devolverLista("a");
    }

    public static ArrayList<Integer> devolverLista(String letra) {
        ArrayList<Integer> numeroLetras = new ArrayList<>();
        for (String st : lista) {
            int acumulador = 0;
            for (int i = 0; i < st.length(); i++) {
                if (letra.equalsIgnoreCase(String.valueOf(st.charAt(i)))) {
                    acumulador++;
                }
            }
            numeroLetras.add(acumulador);
        }
        return numeroLetras;
    }
}
