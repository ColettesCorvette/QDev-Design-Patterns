package fabrique.voiture;

import java.util.HashMap;
import java.util.Map;

public class Simulateur
{
    protected FabriqueVehicule vehicule;

    public Simulateur(FabriqueVehicule vehicule)
    {
        this.vehicule = vehicule;
    }

    public HashMap<String,Integer> genererStats()
    {
        HashMap<String, Integer> m = new HashMap<>();
        FabriqueIntersection f = new FabriqueIntersection();
        for(int i=1;i<100;i++)
        {
            String v = f.creerVehicule().getType();
            if(m.containsKey(v))
            {
                m.put(v,m.get(v)+1);
            }
            else
            {
                m.put(v,1);
            }
        }
        return m;
    }

    public void ecrireStats()
    {
        HashMap<String, Integer> stats = genererStats();
        for (Map.Entry<String, Integer> entry : stats.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
