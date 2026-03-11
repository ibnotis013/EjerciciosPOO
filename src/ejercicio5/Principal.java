package ejercicio5;

/*
 * Haz un método que calcule de forma aleatoria 5 números entre 0 y 10 sin que puedan repetirse y
 *           los devuelva dentro de una lista
 * Haz otro método que recorra la lista de números aleatorios y haz, que los números, se sitúen en
 *             el índice de la lista de ceros
 * Es decir, si mi lista de números aleatorios fue 2, 7, 3, 5, 8 => la lista de ceros sería:
 * 0, 0, 2, 3, 0, 5, 0, 7, 8, 0, 0
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Principal {
    private static ArrayList<Integer> numerosList = new ArrayList<>(Arrays.asList(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
    private static ArrayList<Integer> registroList = new ArrayList<>();
    private static final int NUMERO_BUCLE = 5;

    public static void main(String[] args) {


        calcularNumerosAleatorios();
        for (Integer in:registroList){
            numerosList.set(in,in);
        }

    }

    public static void calcularNumerosAleatorios() {
        Random rand = new Random();
        while (registroList.size() < NUMERO_BUCLE) {
            int numero = rand.nextInt(11);
            if (!registroList.contains(numero)) {
                registroList.add(numero);
            }
        }
    }
}
