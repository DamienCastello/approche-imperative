package fr.algorithmie;

import java.util.*;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        System.out.println("ensemble des éléments du tableau");
        for (int value : array) {
            System.out.println(value);
        }

        System.out.println("ensemble des éléments dans l’ordre inverse du tableau");
        for(int i = array.length -1; i >= 0; i--)
        {
            System.out.println(array[i]);
        }

        System.out.println("--------------");
        System.out.println("tableau arrayCopy");
        int[] arrayCopy = new int[array.length];
        int i = 0;
        for (int value : array) {
            arrayCopy[i] = value;
            i++;
        }



        for (int value : arrayCopy) {
            System.out.println(value);
        }

    }
}
