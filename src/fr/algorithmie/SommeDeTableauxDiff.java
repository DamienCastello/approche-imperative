package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] a1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] a2 = {-1, 12, 17, 14, 5, -9, 0, 18 };

        int maxLength = Math.max(a1.length, a2.length);
        int[] aSum = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {

            int val1 = (i < a1.length) ? a1[i] : 0;
            int val2 = (i < a2.length) ? a2[i] : 0;

            aSum[i] = val1 - val2;

            System.out.println("element index " + i + " = " + aSum[i]);
        }
    }
}
