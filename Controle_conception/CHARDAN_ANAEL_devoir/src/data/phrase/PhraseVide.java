package data.phrase;

/**
 * La classe vide est une singleton
 */
public class PhraseVide implements IPhrase {

    public static final PhraseVide nulle = new PhraseVide();

    @Override
    public int getSize() {
        return 0;
    }

    public String toString() {
        return ".";
    }
}
