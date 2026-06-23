package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] tableau = new int[2];
        int nbElements = 0;

        while (true) {

            System.out.println();
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");

            int choix = scanner.nextInt();

            switch (choix) {

                case 1:

                    System.out.println("Entrez un nombre:");
                    int nombre = scanner.nextInt();

                    if (nbElements == tableau.length) {
                        System.out.println("enter tableau to up");
                        int[] nouveauTableau = new int[tableau.length + 2];

                        for (int i = 0; i < tableau.length; i++) {
                            nouveauTableau[i] = tableau[i];
                        }

                        tableau = nouveauTableau;

                        System.out.println("tableau up");
                    }

                    tableau[nbElements] = nombre;
                    nbElements++;

                    break;

                case 2:

                    System.out.println("Contenu du tableau:");

                    for (int i = 0; i < nbElements; i++) {
                        System.out.println(tableau[i]);
                    }

                    break;

                default:
                    System.out.println("Choix invalide");
            }
        }
    }
}