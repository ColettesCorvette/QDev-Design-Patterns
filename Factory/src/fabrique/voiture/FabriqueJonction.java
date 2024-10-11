package fabrique.voiture;

public class FabriqueJonction implements FabriqueVehicule
{
    private FabriqueIntersection inter1;
    private FabriqueIntersection inter2;

    public FabriqueJonction()
    {
        this.inter1 = new FabriqueIntersection();
        this.inter2 = new FabriqueIntersection();
    }

    public Vehicule creerVehicule()
    {
        int alea = (int)(Math.random()*100);
        if(alea < 50) return inter1.creerVehicule();
        return inter2.creerVehicule();
    }



}
