import java.util.ArrayList;

public class Appv1 {
    public static void main(String[] args) {

        /*
        L'objectif de ce TP est de montrer un programmeur qui expoite le polymorphisme.&
         */

        // Utilisation d'un tableau
        System.out.println("Tableau");
        Fruit[] lesFruits = new Fruit[3];

        lesFruits[0] = new Pomme(40);
        lesFruits[1] = new Orange(50);
        lesFruits[2] = new Pomme(60);

        for (int i=0; i<lesFruits.length;i++) {
            System.out.println("****************************");
            lesFruits[i].afficher();
            System.out.println("****************************");
            lesFruits[i].afficherPoids();
            System.out.println("****************************");
        }

        // Utilisation d'un une collection : ArrayList
        System.out.println("ArrayList");

        ArrayList<Fruit> fruits = new ArrayList<>();

        fruits.add(new Pomme(40));
        fruits.add(new Orange(50));
        fruits.add(new Pomme(60));

        System.out.println("Parcourir avec la boucle for");
        for (int i=0; i<fruits.size(); i++) {
            fruits.get(i).afficher();
            fruits.get(i).afficherPoids();
        }

        System.out.println("Parcourir avec forEach");
        for (Fruit f : lesFruits) {
            f.afficher();
            f.afficherPoids();
        }
    }
}