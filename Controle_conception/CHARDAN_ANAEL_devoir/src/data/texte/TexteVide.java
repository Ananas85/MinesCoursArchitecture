package data.texte;

import data.phrase.IPhrase;

public class TexteVide implements ITexte {

    public static TexteVide nulle = new TexteVide();

    private TexteVide() { }

    @Override
    public int getSize() {
        return 0;
    }

    public String toString()
    {
        return "/////";
    }

    @Override
    public IPhrase get( int i ) {
        return null;
    }
}
