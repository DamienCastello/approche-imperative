package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int plusGrand = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Nombre " + i + " :");
            int nb = scanner.nextInt();

            if (nb > plusGrand) {
                plusGrand = nb;
            }
        }

        System.out.println("Le plus grand nombre est: " + plusGrand);
    }
}