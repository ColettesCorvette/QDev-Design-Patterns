package fabrique.voiture;

public class Bicyclette extends Vehicule
{
    protected double vitesse;

    public Bicyclette() {
        super("Bicyclette",30);
        this.vitesse = 25;
    }
}
