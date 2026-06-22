package fr.tableaux;

import org.w3c.dom.ls.LSOutput;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] arrayInteger = {8, -7, 12, 1, -2, 14, 17, 9};

        System.out.println(arrayInteger[0]);

        System.out.println(arrayInteger.length);

        System.out.println(arrayInteger[arrayInteger.length-1]);

        // fail car la longueur d'éléments max du tableau est 8
        //System.out.println(arrayInteger[10]);
    }
}
