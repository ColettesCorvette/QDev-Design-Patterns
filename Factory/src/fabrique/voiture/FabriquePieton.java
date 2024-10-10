package fabrique.voiture;

public class FabriquePieton implements FabriqueVehicule
{

    @Override
    public Vehicule creerVehicule() {
        return new Pieton();
    }
}
