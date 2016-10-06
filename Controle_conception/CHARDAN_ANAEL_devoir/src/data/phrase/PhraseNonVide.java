package data.phrase;

import vocabulaire.Mot;

/**
 * Une phrase non vide
 */
public class PhraseNonVide implements IPhrase {

    protected Mot premier;

    protected IPhrase reste;

    /**
     * Les constantes de tailles
     */
    public final static int MIN_PHRASE_SIZE = 3;
    public final static int MAX_PHRASE_SIZE = 6;

    public PhraseNonVide( Mot premier, IPhrase reste ) throws PhraseTropLongue {
        if ( reste.getSize() > MAX_PHRASE_SIZE - 1 ) {
            throw new PhraseTropLongue();
        }

        this.premier = premier;
        this.reste = reste;
    }

    @Override
    public int getSize() {
        return 1 + this.reste.getSize();
    }

    public String toString()
    {
        return this.premier + " " + this.reste.toString();
    }
}
