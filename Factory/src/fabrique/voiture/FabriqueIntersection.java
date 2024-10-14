package fabrique.voiture;

import fabrique.voiture.*;

public class FabriqueIntersection implements FabriqueVehicule
{
    private int probaVoiture;
    private int probaPieton;
    private int probaBus;
    private int probaBicyclette;

    public FabriqueIntersection()
    {
        this.probaVoiture = 20;
        this.probaPieton = 20;
        this.probaBus = 20;
        this.probaBicyclette = 40;
    }


    public FabriqueIntersection(int probaVoiture, int probaPieton, int probaBus, int probaBicyclette)
    {
        int somme = probaVoiture + probaPieton + probaBus + probaBicyclette;
        if(somme != 100) throw new IllegalArgumentException("La somme des probabilités doit être égale à 100");

        if(probaVoiture < 0 || probaPieton < 0 || probaBus < 0 || probaBicyclette < 0) throw new IllegalArgumentException("Les probabilités doivent être positives");

        this.probaVoiture = probaVoiture;
        this.probaPieton = probaPieton;
        this.probaBus = probaBus;
        this.probaBicyclette = probaBicyclette;
    }




    @Override
    public Vehicule creerVehicule()
    {
        int alea = (int)(Math.random()*100);
        if(alea < this.probaVoiture) return new Voiture();
        alea-=this.probaVoiture;
        if(alea < this.probaPieton) return new Pieton();
        alea-=this.probaPieton;
        if(alea < this.probaBus) return new Bus();
        return new Bicyclette();

    }
}
