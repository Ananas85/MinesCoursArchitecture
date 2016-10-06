package impl;

import interfaces.IProvidedArbitre;

public class Arbitre implements IProvidedArbitre{
    protected Joueur joueur1;

    protected Joueur joueur2;

    protected Tas tas;

    public Arbitre(Joueur joueur1, Joueur joueur2)
    {
        this.tas = new Tas();
        this.initialize( joueur1, joueur2 );
    }

    @Override
    public void initialize( Joueur joueur1, Joueur joueur2 ) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }

    @Override
    public void nim() {
        System.out.println("Nim vient d'être lancé");
    }

    @Override
    public String winner() {
        return "ANANANANANANANANANANANS";
    }
}
