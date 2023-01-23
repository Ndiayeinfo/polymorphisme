public class Pomme extends  Fruit {

    public Pomme(int poids) {
        super(poids);
        System.out.println("Création d'une pomme de " + poids + " grammes");
    }

    @Override
    public void afficher() {
        System.out.println("C'est une pomme");
    }

    @Override
    public void afficherPoids() {
        System.out.println("C'est une pomme de " + poids + " grammes");
    }
}

