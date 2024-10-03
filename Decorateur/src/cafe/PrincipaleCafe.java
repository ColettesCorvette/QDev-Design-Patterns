package cafe;

public class PrincipaleCafe
{
    public static void main(String[] args)
    {
        Boisson deca = new Deca();
        Boisson decaCremeDoubleChantilly = new BoissonCreme(new BoissonChantilly(new BoissonChantilly(deca)));
        System.out.println(decaCremeDoubleChantilly);
    }
}
