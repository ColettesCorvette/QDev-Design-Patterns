package rene.logo;

public class Smiley extends DecorateurLogo {
    public Smiley(int x, int y, String im,Logo composant) {
        super(x, y, im,composant);
    }

    public double CombienCaCoute(){
        return 5;
    }

}