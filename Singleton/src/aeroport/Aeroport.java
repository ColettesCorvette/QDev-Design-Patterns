package aeroport;

public class Aeroport
{
    private static Aeroport instance;
    private Aeroport()
    {
        System.out.println("Creation de l'aeroport");
    }

    public synchronized static Aeroport getInstance()
    {
        if(instance==null)
        {
            instance = new Aeroport();
        }
       return instance;
    }

    public synchronized void faireDecoller(Avion avion)
    {
        avion.decoller();
    }
}
