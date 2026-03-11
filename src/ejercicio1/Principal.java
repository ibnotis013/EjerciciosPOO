package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;


/*
 * Instancia un ArrayList de objetos Integer (ya que no puede almacenar tipos primitivos)
 * Haz un método de tal forma que el ArrayList se rellene con 5 números que meta el usuario
 * por teclado, ni más, ni menos y devuelva el ArrayList completo con los números
 * */
public class Principal {
    private static final int NUMERO_BUCLE = 5;

    public static void main(String[] args) {

        System.out.println(almacenarEIntroducirNumeros());

    }

    public static ArrayList<Integer> almacenarEIntroducirNumeros() {
        ArrayList<Integer> arrayNumeros=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numero;
        for (int i = 1; i <= NUMERO_BUCLE; i++) {
            System.out.println("introduce un numero");
            numero = sc.nextInt();
            arrayNumeros.add(numero);
        }
        return  arrayNumeros;
    }

}
