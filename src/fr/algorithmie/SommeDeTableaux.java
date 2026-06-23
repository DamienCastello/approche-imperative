package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String[] args) {
        int[] a1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] a2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};

        int[] aSum = new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
            aSum[i] = a1[i] + a2[i];
            System.out.println("element index " + i + " = " + aSum[i]);
        }
    }
}
