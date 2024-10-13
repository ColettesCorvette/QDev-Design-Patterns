package aeroport;

public class Aeroport
{
    private boolean piste_libre;

    public Aeroport()
    {
        this.piste_libre=true;
    }

    public static Aeroport getInstance()
    {
        return new Aeroport();
    }

    @Override
    public String toString() {
        return "Aeroport{" +
                "piste_libre=" + piste_libre +
                '}';
    }

    public synchronized boolean autoriserAdecoller()
    {
        if(this.piste_libre)
        {
            this.piste_libre=false;
            return true;
        }
        return false;
    }

    public synchronized boolean libererPiste()
    {
        if(!this.piste_libre)
        {
            this.piste_libre=true;
            return true;
        }
        return false;
    }
}
