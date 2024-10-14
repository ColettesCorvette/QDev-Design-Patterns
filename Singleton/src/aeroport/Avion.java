package aeroport;

public class Avion extends Thread
{
    private String nom;
    private Aeroport a;

    public Avion(String s){
        this.nom=s;
    }

    public void run() {
        this.a = Aeroport.getInstance();
        System.out.println("Avion " + this.nom + " sur aeroport " + this.a);
        this.a.faireDecoller(this);

    }

    public void decoller(){
        System.out.println("Décollage avion" + this.nom + " sur aeroport " + this.a);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //atterir
        System.out.println("Atterrissage avion " + this.nom + " sur aeroport " + this.a);
    }
}



