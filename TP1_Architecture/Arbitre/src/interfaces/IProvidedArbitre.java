package interfaces;

import impl.Joueur;

public interface IProvidedArbitre {

    public void initialize( Joueur joueur1, Joueur joueur2 );

    public void nim();

    public String winner();


}
