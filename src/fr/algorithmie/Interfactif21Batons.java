package fr.algorithmie;

import java.util.Scanner;
import java.util.Random;

public class Interfactif21Batons {
    public static void main(String[] args) {
        int batons = 21;
        double randomValue = Math.random();
        boolean botToPlay = randomValue > 0.50;

        while (batons > 0){
            if(botToPlay) {
                Random random = new Random();
                int botChoice;
                if(batons == 4) {
                    botChoice = 3;
                } else if(batons == 3) {
                    botChoice = 2;
                } else if(batons == 2) {
                    botChoice = 1;
                } else {
                    botChoice = random.nextInt(3) + 1;
                }
                System.out.println("l'adversaire a pris " + botChoice + " baton" + (botChoice > 1 ? "s !" : " !"));

                batons -= botChoice;

                System.out.println("il reste " + batons + " baton" + (batons > 1 ? "s !" : " !"));

                if (batons == 0) System.out.println("Il a perdu ce boloss de pc !");
            }
            else {
                Scanner scanner = new Scanner(System.in);

                int nombre = 1;
                System.out.println("Prendre entre 1 et 3 batons:");
                nombre = scanner.nextInt();
                while (nombre < 1 || nombre > 3) {
                    System.out.println("Il faut choisir entre 1 et 3 batons !");
                    nombre = scanner.nextInt();
                }

                System.out.println("vous avez pris " + nombre + " baton" + (nombre > 1 ? "s !" : " !"));

                batons -= nombre;

                System.out.println("il reste " + batons + " baton" + (batons > 1 ? "s !" : " !"));

                if (batons == 0) System.out.println("Tu as perdu looser !");
            }
            botToPlay = !botToPlay;
        }
    }
}
