package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] villes = {"Arles", "Montpellier", "Marseille", "Aix-en-provence", "Paris"};

        for(int i=0; i< villes.length;i++){
            System.out.println(villes[i]);
        }

        System.out.println(villes.length);

        villes[2] = "Reims";

        for(int i=0; i< villes.length;i++){
            System.out.println(villes[i]);
        }
    }
}
