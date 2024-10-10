package rene.logo;

public class Chapeau extends DecorateurLogo{
    public Chapeau(int x, int y, String im, Logo composant){
        super(x,y,im, composant);
    }
    public int CombienCaCoute(){
        return 2;
    }
}
