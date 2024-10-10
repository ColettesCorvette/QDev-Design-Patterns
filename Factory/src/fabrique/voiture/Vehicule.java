package fabrique.voiture;

public abstract class Vehicule
{
    private String type;
    private double vitesseMax;

    public Vehicule(String type, double vMax)
    {
        this.type=type;
        this.vitesseMax=vMax;
    }

    public String getType() {
        return type;
    }

    public double getVitesseMax() {return vitesseMax;}
}
