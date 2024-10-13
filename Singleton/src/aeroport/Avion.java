package aeroport;

public class Avion extends Thread
{
    private String nom;
    private Aeroport a;
    public Avion(String s){
        this.nom=s;
        this.a=Aeroport.getInstance();
    }
    public void run(){

        int timer = (int)(100+Math.random()*1000);

        if(this.a.autoriserAdecoller())
        {
            System.out.println("Je suis avion " + this.nom+" je decolle");
            try {
                Thread.sleep(timer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.a.libererPiste();
            System.out.println("Je suis avion " + this.nom+" j'ai libéré la piste");
        }
        else
        {
            System.out.println("Je suis avion " + this.nom+" je n'ai pas pu decoller");
        }
    }
}
