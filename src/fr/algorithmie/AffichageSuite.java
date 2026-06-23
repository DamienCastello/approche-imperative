package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        System.out.println("nombres de 1 à 10 inclus");
        for(int i = 1;i < 11; i++){
            System.out.println(i);
        }

        System.out.println("nombres pairs entre 0 et 10 inclus");
        for(int i = 1;i < 11; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        System.out.println("nombres impairs entre 0 et 9 inclus");
        for(int i = 0;i < 10; i++){
            if(i%2==1){
                System.out.println(i);
            }
        }

        System.out.println("nombres de 1 à 10 inclus");
        int i = 0;
        while (i<10) {
            System.out.println(i+1);
            i++;
        }

        System.out.println("nombres pairs entre 0 et 10 inclus");
        i = 0;
        while (i<11) {
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }

        System.out.println("nombres impairs entre 0 et 9 inclus");
        i = 0;
        while (i<10) {
            if(i%2==1){
                System.out.println(i);
            }
            i++;
        }
    }
}
