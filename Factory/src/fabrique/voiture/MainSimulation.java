package fabrique.voiture;

public class MainSimulation
{
    public static void main(String[] args)
    {
        FabriqueVehicule f = new FabriqueIntersection(10, 10, 10, 70);
        Simulateur s = new Simulateur(f);
        FabriqueJonction j = new FabriqueJonction();
        Simulateur s2 = new Simulateur(j);

        s.ecrireStats();
        System.out.println("\n");
        s2.ecrireStats();
    }
}
