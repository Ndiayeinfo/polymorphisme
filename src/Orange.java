public class Orange extends  Fruit {

    public Orange(int poids) {
        super(poids);
        System.out.println("Création d'une orange de " + poids + " grammes");
    }

    @Override
    public void afficher() {
        System.out.println("C'est une orange");
    }

    @Override
    public void afficherPoids() {
        System.out.println("C'est une orange de " + poids + " grammes");
    }
}
