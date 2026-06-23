package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {

        int[] array = {4, 1, 2, 3, 4};

        boolean result =
                array.length > 0 &&
                        array[0] == array[array.length - 1];

        System.out.println(result);
    }
}