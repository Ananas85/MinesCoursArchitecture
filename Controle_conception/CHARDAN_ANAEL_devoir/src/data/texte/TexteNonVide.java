package data.texte;

import data.phrase.IPhrase;

public class TexteNonVide implements ITexte {

    protected IPhrase firstPhrase;

    protected ITexte reste;

    public final static int MIN_TEXTE_SIZE = 1;
    public final static int MAX_TEXTE_SIZE = 20;

    public TexteNonVide( IPhrase firstPhrase, ITexte reste ) throws TexteTropLong {
        if ( reste.getSize() > MAX_TEXTE_SIZE -1 ) {
            throw new TexteTropLong();
        }

        this.firstPhrase = firstPhrase;
        this.reste = reste;
    }

    public IPhrase getFirstPhrase() {
        return firstPhrase;
    }

    public ITexte getReste() {
        return reste;
    }

    @Override
    public int getSize() {
        return 1 + this.reste.getSize();
    }


    @Override
    public IPhrase get( int i ) {
        if ( i <= 0 ) {
            return this.firstPhrase;
        }

        return this.reste.get( i - 1 );
    }

    public String toString()
    {
        return this.getFirstPhrase().toString() + " " + this.getReste().toString();
    }
}
