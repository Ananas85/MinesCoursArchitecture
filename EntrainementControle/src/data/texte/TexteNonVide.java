package data.texte;

import data.phrase.IPhrase;

public class TexteNonVide extends Texte {

    IPhrase firstPhrase;

    Texte rest;

    /**
     * Constants for the size.
     */
    public final static int MIN_TEXTE_SIZE = 1;
    public final static int MAX_TEXTE_SIZE = 20;

    public TexteNonVide( IPhrase phrase, Texte rest ) throws TexteTropLong {
        if ( rest.size() > MAX_TEXTE_SIZE -1 ) {
            throw new TexteTropLong();
        }

        this.firstPhrase = phrase;
        this.rest = rest;
    }


    public IPhrase getPremier() {
        return firstPhrase;
    }

    public Texte getSuite() {
        return rest;
    }

    @Override
    public int size() {
        return 1 + rest.size();
    }

    @Override
    public IPhrase get( int i ) {
        if ( i <= 0 )
        {
            return this.firstPhrase;
        }

        return this.rest.get(i-1);
    }
}
