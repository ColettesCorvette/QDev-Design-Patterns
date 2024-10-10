package fabrique.voiture;

public class Pieton extends Vehicule
{
    protected double vitesse;
    public Pieton() {
        super("Pieton",10);
        this.vitesse = 4;
    }
}
