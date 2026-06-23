package fr.algorithmie;

import java.util.Scanner;

public class TestFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Donner un rang:");
        int rank = scanner.nextInt();

        int valueRankMinus1 = 0;
        int valueRankMinus2 = 1;
        int result = 1;

        if (rank == 0) System.out.println("nombre fibonacci de rang " + 0 + " est: " + 0);
        if (rank == 1) System.out.println("nombre fibonacci de rang " + 1 + " est: " + 1);
        for (int i = 2; i < rank; i++){
            result += valueRankMinus1 + valueRankMinus2;
            int temp = valueRankMinus1;
            valueRankMinus1 = valueRankMinus2;
            valueRankMinus2 = temp + valueRankMinus2;
        }
        System.out.println("nombre fibonacci de rang " + rank + " est: " + result);
    }
}
