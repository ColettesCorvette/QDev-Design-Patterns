package rene.logo;



public class Main
{
   
    public static void main(String args[])
    {
        ReneLaTaupe l = new ReneLaTaupe();
        MyImage i = l.getLogo(); 
        
        i.paintOver("img/Chapeau.png", 280,42);
        
        i.display();
        
        
    }
        
}
