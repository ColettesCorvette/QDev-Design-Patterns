package rene.logo;

public class DecorateurLogo extends Logo
{
    protected Logo composant;
    protected int x,y;
    protected String im;

    public DecorateurLogo(int x, int y, String im, Logo composant)
    {
        this.composant = composant;
        this.x = x;
        this.y = y;
        this.im = im;
    }

    public MyImage getLogo(){
        MyImage i = composant.getLogo();
        i.paintOver(im, x, y);
        return i;
    }

    public double combienCaCoute()
    {
        return super.combienCaCoute()+composant.combienCaCoute();
    }
}
