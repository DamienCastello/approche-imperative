package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] arrayCopy = new int [array.length];

        System.out.println("arrayCopy mais dans l’ordre inverse");
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[array.length - 1 - i];
        }

        System.out.println("ensemble des éléments des 2 tableaux");
        for (int value : array) {
            System.out.println(value);
        }

        System.out.println("------");

        for (int value : arrayCopy) {
            System.out.println(value);
        }
    }
}
