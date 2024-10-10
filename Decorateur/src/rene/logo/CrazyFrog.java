package rene.logo;

public class CrazyFrog extends Logo
{
    private String im;
    private double price;

    public CrazyFrog() {
        this.price = 3;
        this.im="img/CrazyFrog.jpg";
    }

    public double combienCaCoute() {
        return this.price;
    }

    public MyImage getLogo() {
        return new MyImage(this.im);
    }
}
