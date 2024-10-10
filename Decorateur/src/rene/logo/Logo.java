package rene.logo;

public abstract class Logo
{

    public String path;
    public double prix;



    public double combienCaCoute()
    {
        return this.prix;
    }


    public MyImage getLogo()
    {
        return new MyImage(this.path);
    }
}
