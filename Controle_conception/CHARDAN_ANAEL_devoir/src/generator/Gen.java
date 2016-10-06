package generator;

import data.phrase.IPhrase;
import data.phrase.PhraseVide;
import data.texte.ITexte;
import data.texte.TexteNonVide;
import iterateur.Iterator;

public class Gen implements Iterator<IPhrase> {

    protected ITexte texte;

    protected ITexte current;

    public Gen( ITexte texte ) {
        this.texte = texte;
        this.first();
    }

    @Override
    public void first() {
        this.current = this.texte;
    }

    @Override
    public void next() {
        this.current = ((TexteNonVide) this.current).getReste();
    }

    @Override
    public boolean isDone() {
        return this.current.getSize() == 0;
    }

    @Override
    public IPhrase current() {
        if (this.current.getSize() == 0) {
            return PhraseVide.nulle;
        }

        return ((TexteNonVide) this.current).getFirstPhrase();
    }
}
