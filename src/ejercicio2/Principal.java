package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * Instancia un ArrayList de objetos Integer (ya que no puede almacenar tipos primitivos)
 * Haz que el ArrayList se rellene con 5 números que meta el usuario por teclado, ni más, ni menos
 * Haz un método calculoSuma() que calcula la suma del total de los números
 * */
public class Principal {
    private static final int NUMERO_BUCLE = 5;

    public static void main(String[] args) {

        System.out.println(calculoSuma(almacenarEIntroducirNumeros()));
    }

    public static ArrayList<Integer> almacenarEIntroducirNumeros() {
        ArrayList<Integer> arrayNumeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numero;

        for (int i = 1; i <= NUMERO_BUCLE; i++) {
            System.out.println("introduce un numero");
            numero = sc.nextInt();
            arrayNumeros.add(numero);

        }
        return arrayNumeros;
    }

    public static Integer calculoSuma(ArrayList<Integer> arrayNumeros) {
        int suma = 0;
        for (Integer in : arrayNumeros) {
            suma += in;
        }
        return suma;
    }
}
