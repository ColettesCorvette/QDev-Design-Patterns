package rene.logo;

public class Lunette extends DecorateurLogo{

    public Lunette(int x, int y, String im,Logo composant){
        super(x,y,im, composant);
    }
    public int CombienCaCoute(){
        return 1;
    }
}
