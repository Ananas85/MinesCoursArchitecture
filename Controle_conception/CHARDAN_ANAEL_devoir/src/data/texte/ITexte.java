package data.texte;

import data.phrase.IPhrase;

public interface ITexte {

    public int getSize();

    public String toString();

    public IPhrase get(int i);
}
