package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int secret = (int) (Math.random() * 100) + 1;

        int essais = 0;
        int proposition;

        do {
            System.out.println("Devinez le nombre:");
            proposition = scanner.nextInt();
            essais++;

            if (proposition < secret) {
                System.out.println("C'est plus !");
            }
            else if (proposition > secret) {
                System.out.println("C'est moins !");
            }

        } while (proposition != secret);

        System.out.println(
                "Bravo, vous avez trouvé en "
                        + essais
                        + " coups !");
    }
}