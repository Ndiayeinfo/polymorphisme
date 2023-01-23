public abstract class Fruit {
    protected int poids;

    public Fruit(int poids) {
        this.poids = poids;
        System.out.println("Création d'un fruit de "+ poids + " grammes");
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public abstract void afficher();

    public abstract  void afficherPoids();
}
