package fabrique.voiture.UML;

import fabrique.voiture.*;

public class FabriqueIntersection implements FabriqueVehicule
{

    @Override
    public Vehicule creerVehicule()
    {
        int alea = (int)(Math.random()*100);
        if(alea < 80) return new Voiture();
        alea-=80;
        if(alea < 10) return new Pieton();
        alea-=10;
        if(alea < 5) return new Bus();
        return new Bicyclette();

    }
}
