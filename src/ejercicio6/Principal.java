package ejercicio6;

/*
 * Haz un método que reciba una lista de String y devuelva el String más largo de la lista
 * */

import java.util.ArrayList;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        System.out.println(listaString());
    }

    public static ArrayList<String> listaString() {
        ArrayList<String> lista = new ArrayList<String>(Arrays.asList("Nicolás", "Francisco", "Hugo", "Lucas", "Ruben", "Iker", "Sofia", "Jose Luis", "Diego", "Rico", "Amanda","Francisca"));
        ArrayList<String> nombreMasLargos= new ArrayList<>();
        String masLargo = "";
        for (String st : lista) {
            if (st.length() > masLargo.length()) {
                masLargo = st;
            }
        }
        for(String st : lista){
            if (st.length() == masLargo.length()){
                nombreMasLargos.add(st);
            }
        }
        return nombreMasLargos;
    }
}
