package rene.logo;


public class ReneLaTaupe extends Logo{
	/**
     * Chemin d'acces au fichier
     * contenant l'image de fond du rene.logo
     */
    private String nomIm;
    
    /**
     * Prix du rene.logo
     */
    private double prix;
    
    /**
     * Constructeur
     */
    public ReneLaTaupe() {
        nomIm = "img/Taupe.jpg";
        prix=3.65;
    }
    
    /**
     * @return l'objet de MyImage correspondant a nomIm
     */
    public MyImage getLogo(){
        return new MyImage(nomIm);
    }
    
    /**
     * @return le prix du rene.logo
     */
    public double combienCaCoute()
    {
        return prix;
    }
}
