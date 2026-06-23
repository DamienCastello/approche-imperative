package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre entre 1 et 10:");
        int nb = scanner.nextInt();

        while (nb < 1 || nb > 10) {
            System.out.println("Nombre invalide. Recommencez:");
            nb = scanner.nextInt();
        }

        System.out.println("Nombre saisi: " + nb);
    }
}
