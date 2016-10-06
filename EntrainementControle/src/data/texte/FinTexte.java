package data.texte;

import data.phrase.IPhrase;

/**
 * Singleton
 */
public class FinTexte extends Texte {

    public static FinTexte nulle = new FinTexte();

    private FinTexte(){}

    @Override
    public int size() {
        return 0;
    }

    @Override
    public IPhrase get( int i ) {
        return null;
    }
}
