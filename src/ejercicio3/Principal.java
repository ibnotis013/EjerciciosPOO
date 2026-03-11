package ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Con el ArrayList ya instanciado e inicializado con esos 5 números
 * Haz un método que calcule el número mayor y el número menor devolviendo una lista de 2 números
 * */
public class Principal {
    static ArrayList<Integer> numerosList = new ArrayList<Integer>(Arrays.asList(4, 5, 8, 9, 3));

    public static void main(String[] args) {

        System.out.println(recorrerLista(numerosList));

    }

    public static ArrayList<Integer> recorrerLista(ArrayList<Integer> lista) {
        int mayor = lista.getFirst();
        int menor = lista.getFirst();

        for (Integer in : lista) {
            if (in >= mayor) {
                mayor = in;
            }
            if (in <= menor) {
                menor = in;
            }
        }
        ArrayList<Integer> listaFinal = new ArrayList<Integer>();
        listaFinal.add(menor);
        listaFinal.add(mayor);
        return listaFinal;
    }
}
